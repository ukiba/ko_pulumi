package jp.ukiba.ko_pulumi

import scala.collection.immutable.VectorMap
import scala.collection.mutable.{LinkedHashMap, ArrayBuffer}
import java.util.NoSuchElementException

/**
 * A map that compares keys by object reference (identity) and keeps insertion order.
 * Useful when building a map from created resources to associated data, e.g., resource specifications.
 * O(n) lookup/update/remove; intended for small maps.
 *
 * Re-inserting the same key reference updates the value
 * while preserving the original insertion position.
 *
 * This class cannot extend `Map` since
 * `def map[K2, V2](f: ((K, V)) => (K2, V2)): Map[K2, V2]` and some other methods cannot preserve the semantics
 * (`K2` is unbounded and might not be `AnyRef`).
 */
final class IdentityOrderedMap[K <: AnyRef, +V] private (  // the constructor is private
  private val entries: Vector[(K, V)]
):
  // those that should be overridden for AbstractMap

  def get(key: K): Option[V] =
    entries.collectFirst:
      case (k, v) if k.eq(key) => v  // compares object references

  def updated[V1 >: V](key: K, value: V1): IdentityOrderedMap[K, V1] =
    val index = entries.indexWhere:
      (k, _) => k.eq(key)

    if index < 0 then
      new IdentityOrderedMap(entries :+ (key -> value))  // Vector[(K, V)] is widened to Vector[(K, V1)]
    else
      new IdentityOrderedMap(entries.updated(index, key -> value))  // widened also

  def removed(key: K): IdentityOrderedMap[K, V] =
    val index = entries.indexWhere(_._1.eq(key))  // there is at most one key
    if index < 0 then
      this
    else
      new IdentityOrderedMap(entries.patch(index, Nil, 1))

  def iterator: Iterator[(K, V)] = entries.iterator

  // map / flatMap
  // scaladoc renders the parameter type to be `(K, V)`, but they are actually `((K, V))`

  def map[B](f: ((K, V)) => B): Iterable[B] = entries.map(f)
  def map[K2 <: AnyRef, V2](f: ((K, V)) => (K2, V2)): IdentityOrderedMap[K2, V2] =
    IdentityOrderedMap.from(entries.iterator.map(f))  // remove duplicates

  def flatMap[B](f: ((K, V)) => IterableOnce[B]): Iterable[B] = entries.flatMap(f)
  def flatMap[K2 <: AnyRef, V2](f: ((K, V)) => IterableOnce[(K2, V2)]): IdentityOrderedMap[K2, V2] =
    IdentityOrderedMap.from(entries.iterator.flatMap(f))  // remove duplicates

  // groupBy

  def groupBy[K2](f: ((K, V)) => K2): VectorMap[K2, IdentityOrderedMap[K, V]] =  // group-encounter order preserved
    val staged = LinkedHashMap.empty[K2, ArrayBuffer[(K, V)]]
    entries.foreach: kv =>
      staged.getOrElseUpdate(f(kv), ArrayBuffer.empty) += kv
    staged.foldLeft(VectorMap.empty[K2, IdentityOrderedMap[K, V]]):
      case (acc, (k2, buf)) => acc.updated(k2, new IdentityOrderedMap(buf.toVector))

  // standard map-shaped operations

  def apply(key: K): V = get(key).getOrElse(throw NoSuchElementException(s"key not found: $key"))
  def getOrElse[V1 >: V](key: K, default: => V1): V1 = get(key) match
    case Some(v) => v
    case None => default
  def contains(key: K): Boolean = entries.exists { (k, _) => k.eq(key) }

  def concat[V1 >: V](suffix: IterableOnce[(K, V1)]): IdentityOrderedMap[K, V1] =
    suffix.iterator.foldLeft[IdentityOrderedMap[K, V1]](this):
      case (m, (k, v)) => m.updated(k, v)

  def filter(pred: ((K, V)) => Boolean): IdentityOrderedMap[K, V] =
    new IdentityOrderedMap(entries.filter(pred))
  def filterNot(pred: ((K, V)) => Boolean): IdentityOrderedMap[K, V] =
    new IdentityOrderedMap(entries.filterNot(pred))

  def partition(pred: ((K, V)) => Boolean): (IdentityOrderedMap[K, V], IdentityOrderedMap[K, V]) =
    val (a, b) = entries.partition(pred)
    (new IdentityOrderedMap(a), new IdentityOrderedMap(b))
  def transform[W](f: (K, V) => W): IdentityOrderedMap[K, W] =  // implemented in MapOps; not ((K, V))
    new IdentityOrderedMap(entries.map { case (k, v) => k -> f(k, v) })

  def removedAll(keys: IterableOnce[K]): IdentityOrderedMap[K, V] =
    keys.iterator.foldLeft(this)(_.removed(_))

  def +[V1 >: V](kv: (K, V1)): IdentityOrderedMap[K, V1] = updated(kv._1, kv._2)
  def -(key: K): IdentityOrderedMap[K, V] = removed(key)
  def ++[V1 >: V](suffix: IterableOnce[(K, V1)]): IdentityOrderedMap[K, V1] = concat(suffix)
  def --(keys: IterableOnce[K]): IdentityOrderedMap[K, V] = removedAll(keys)

  // traversal
  def foreach[U](f   : ((K, V)) => U      ): Unit           = entries.foreach(f)
  def forall    (pred: ((K, V)) => Boolean): Boolean        = entries.forall(pred)
  def exists    (pred: ((K, V)) => Boolean): Boolean        = entries.exists(pred)
  def count     (pred: ((K, V)) => Boolean): Int            = entries.count (pred)
  def find      (pred: ((K, V)) => Boolean): Option[(K, V)] = entries.find  (pred)

  // cardinality

  def size     : Int     = entries.size
  def isEmpty  : Boolean = entries.isEmpty
  def nonEmpty : Boolean = entries.nonEmpty
  def knownSize: Int     = entries.size

  // projections

  def keys  : Iterable[K] = entries.view.map(_._1)
  def values: Iterable[V] = entries.view.map(_._2)
  def keysIterator  : Iterator[K] = entries.iterator.map(_._1)
  def valuesIterator: Iterator[V] = entries.iterator.map(_._2)

  // those that make sense since this is ordered

  def head: (K, V) = entries.head
  def headOption: Option[(K, V)] = entries.headOption
  def last: (K, V) = entries.last
  def lastOption: Option[(K, V)] = entries.lastOption

  def tail: IdentityOrderedMap[K, V] = new IdentityOrderedMap(entries.tail)
  def init: IdentityOrderedMap[K, V] = new IdentityOrderedMap(entries.init)

  def take(n: Int): IdentityOrderedMap[K, V] = new IdentityOrderedMap(entries.take(n))
  def drop(n: Int): IdentityOrderedMap[K, V] = new IdentityOrderedMap(entries.drop(n))
  def takeRight(n: Int): IdentityOrderedMap[K, V] = new IdentityOrderedMap(entries.takeRight(n))
  def dropRight(n: Int): IdentityOrderedMap[K, V] = new IdentityOrderedMap(entries.dropRight(n))

  def takeWhile(pred: ((K, V)) => Boolean): IdentityOrderedMap[K, V] =
    new IdentityOrderedMap(entries.takeWhile(pred))
  def dropWhile(pred: ((K, V)) => Boolean): IdentityOrderedMap[K, V] =
    new IdentityOrderedMap(entries.dropWhile(pred))

  def slice(from: Int, until: Int): IdentityOrderedMap[K, V] =
    new IdentityOrderedMap(entries.slice(from, until))

  def splitAt(n: Int): (IdentityOrderedMap[K, V], IdentityOrderedMap[K, V]) =
    val (a, b) = entries.splitAt(n)
    (new IdentityOrderedMap(a), new IdentityOrderedMap(b))
  def span(pred: ((K, V)) => Boolean): (IdentityOrderedMap[K, V], IdentityOrderedMap[K, V]) =
    val (a, b) = entries.span(pred)
    (new IdentityOrderedMap(a), new IdentityOrderedMap(b))

  // conversions

  def toVector: Vector[(K, V)] = entries
  def toSeq: Seq[(K, V)] = entries
  def toList: List[(K, V)] = entries.toList
  /** The returned map collapses by equals, not identity */ def toMap: Map[K, V] = entries.toMap

  // equality

  override def equals(that: Any): Boolean = that.asInstanceOf[Matchable] match  // asInstanceOf suppresses warning
    case other: IdentityOrderedMap[?, ?] @unchecked =>
      entries.lengthCompare(other.entries) == 0 && entries.iterator.zip(other.entries.iterator).forall:
        case ((k1, v1), (k2, v2)) => k1.eq(k2) &&
            java.util.Objects.equals(v1, v2)  // v1 == v2 is compile error under `-language:strictEquality`
    case _ => false  // deliberately not equal to a plain Map; sidesteps the asymmetry

  override def hashCode: Int =
    entries.foldLeft(0):
      case (h, (k, v)) => h * 31 + System.identityHashCode(k) * 31 + v.##

  // debug

  override def toString: String =
    entries.map((k, v) => s"$k -> $v").mkString("IdentityOrderedMap(", ", ", ")")

object IdentityOrderedMap:
  def from[K <: AnyRef, V](entries: IterableOnce[(K, V)]): IdentityOrderedMap[K, V] =
    entries.iterator.foldLeft(empty[K, V]):
      case (map, (k, v)) => map.updated(k, v)

  def apply[K <: AnyRef, V](entries: (K, V)*): IdentityOrderedMap[K, V] = from(entries)

  def empty[K <: AnyRef, V]: IdentityOrderedMap[K, V] = new IdentityOrderedMap(Vector.empty)
