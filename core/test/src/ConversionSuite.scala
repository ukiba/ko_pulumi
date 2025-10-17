package jp.ukiba.ko_pulumi

import com.pulumi.core.Output
import java.util.{List as JList, Map as JMap}

import scala.language.implicitConversions
import syntax.all.{*, given}

// Checks for the Seq/Map -> Output[JList/JMap] conversions: that the intended call shapes
// compile (and run), and that the union conversion's NotGiven guard rejects a value element
// that is itself an Output. Negative cases use munit's `compileErrors` so "must not compile"
// is an assertion rather than a throwaway snippet.
class ConversionSuite extends munit.FunSuite:
  // mimics the user's evalApply[A](output: Output[A]): Unit — polymorphic, fully open target
  def evalApply[A](output: Output[A]): Unit = ()
  // an open-but-shaped target: Output[JList[A]]
  def evalApplyList[A](output: Output[JList[A]]): Unit = ()

  // --- positive: these must compile and run ---

  test("pure Seq[Output[A]] into a fully open Output[A] target"):
    // the case that regressed: resolves via the specific given, A pinned exactly
    val outputs: Seq[Output[Unit]] = Seq(Output.of(()), Output.of(()))
    evalApply(outputs)

  test("value Seq[A] into a concrete target"):
    val v: Output[JList[String]] = Seq("0.0.0.0/0", "10.0.0.0/8")
    assert(v != null)

  test("value Seq[A] into an open Output[JList[A]] target"):
    evalApplyList(Seq("a", "b"))

  test("value Seq[A] into a fully open Output[A] target"):
    evalApply(Seq("a", "b"))

  test("mixed Seq[Output[A] | A] into a concrete target"):
    val mixed: Output[JList[String]] = Seq(Output.of("a"), "b")
    assert(mixed != null)

  test("mixed Seq[Output[A] | A] into a fully open Output[A] target"):
    evalApply(Seq(Output.of("a"), "b"))

  test("mixed Seq into an open target unwraps Output (element type is String)"):
    // route a mixed seq into an open Output[JList[A]] so A is inferred from the conversion,
    // then call a String-only method on an element. Compiles iff A = String (the union given
    // unwrapped the Output), and fails if A = Output[String] | String (no unwrapping).
    def grab[A](o: Output[JList[A]]): Output[JList[A]] = o
    val g = grab(Seq(Output.of("a"), "b"))
    val len: Output[Int] = g.map(_.get(0).length)
    assert(len != null)

  test("pure Map[String, Output[V]] into a concrete target"):
    val m: Output[JMap[String, String]] = Map("k" -> Output.of("v"))
    assert(m != null)

  test("value Map[String, V] into a concrete target"):
    val m: Output[JMap[String, String]] = Map("k" -> "v")
    assert(m != null)

  test("mixed Map[String, Output[V] | V] into a concrete target"):
    val m: Output[JMap[String, String]] = Map("k1" -> Output.of("v1"), "k2" -> "v2")
    assert(m != null)

  // --- negative: the NotGiven guard must reject a value element that is itself an Output ---

  test("guard rejects mixed-nested Seq (A = Output[String])"):
    // the plain Output[String] branch isn't Output[Output[String]], so the specific given
    // (all-Output[A]) doesn't apply and this routes to the guarded union given with
    // A = Output[String], which NotGiven[A <:< Output[?]] must reject.
    val errors = compileErrors:
      """val s: Seq[Output[Output[String]] | Output[String]] = Seq(Output.of(Output.of("x")))
         val bad: Output[JList[Output[String]]] = s"""
    assert(errors.nonEmpty, "expected the union conversion to be rejected, but it compiled")

  test("control: the same shape with a non-Output element compiles"):
    // sanity check that the negative test above fails for the guard, not for unrelated reasons
    val errors = compileErrors:
      """val s: Seq[Output[String] | String] = Seq(Output.of("x"), "y")
         val ok: Output[JList[String]] = s"""
    assertEquals(errors, "")
