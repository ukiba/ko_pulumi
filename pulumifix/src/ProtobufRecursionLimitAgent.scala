package pulumifix

import net.bytebuddy.agent.builder.AgentBuilder
import net.bytebuddy.asm.Advice
import net.bytebuddy.matcher.ElementMatchers.*

import scala.annotation.static
import java.lang.instrument.Instrumentation

/**
 * This avoids the exception
 *
 *     io.grpc.StatusRuntimeException: CANCELLED: Failed to read message.
 *     Caused by: io.grpc.StatusRuntimeException: INTERNAL: Invalid protobuf byte sequence
 *     Caused by: com.google.protobuf.InvalidProtocolBufferException: Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.
 *
 * that occurs with `pulumi preview` when
 *
 * 1. wafv2.WebAcl rules are specified, or
 * 2. `pulumi import` imports rules (even with `ignoreChanges("rules")`)
 */
object ProtobufRecursionLimitAgent:
  /** Protobuf's default of [100]((https://github.com/protocolbuffers/protobuf/blob/main/java/core/src/main/java/com/google/protobuf/CodedInputStream.java#L41)) is too low for WAFv2 rule trees. */
  val RecursionLimit = 1000

  def premain(args: String, inst: Instrumentation): Unit =
    AgentBuilder.Default()
      // Only instrument constructor bodies (no field/method additions), so we can retransform
      // classes that may already be loaded by the time the agent runs.
      .disableClassFormatChanges()
      .`with`(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
      // CodedInputStream is abstract; concrete subclasses (StreamDecoder, ArrayDecoder,
      // UnsafeDirectNioDecoder, IterableDirectByteBufferDecoder) are what actually get
      // instantiated. Match the type itself AND every subtype.
      // Name-based matchers — not `isSubTypeOf(CodedInputStream.class)` — so the agent
      // doesn't drag protobuf-java onto its own classpath.
      .`type`(
        named("com.google.protobuf.CodedInputStream")
          .or(hasSuperType(named("com.google.protobuf.CodedInputStream")))
      )
      .transform: (builder, _, _, _, _) =>
        builder.visit(Advice.to(classOf[RaiseLimitAdvice]).on(isConstructor))
      .installOn(inst)

  /**
   * Patched onto the exit of every CodedInputStream constructor.
   *
   * Why override the instance field rather than the static [`defaultRecursionLimit = 
100`](https://github.com/protocolbuffers/protobuf/blob/main/java/core/src/main/java/com/google/protobuf/CodedInputStream.java#L41):
   * the static is `final`, so javac inlines its value into every constructor's bytecode.
   * Mutating the static field at runtime (even via Unsafe) has no effect on existing
   * bytecode. Calling `setRecursionLimit` on the freshly-constructed instance does.
   *
   * Companion class is empty but required: Scala 3's `@static` only emits a real JVM
   * static method when there's a class to attach it to.
   */
  class RaiseLimitAdvice
  object RaiseLimitAdvice:
    @static
    // suppress = Throwable: an exception from this hook would propagate out of a
    // CodedInputStream constructor and break legitimate parsing. If the protobuf-java API
    // ever changes shape, we silently no-op instead of crashing the program.
    @Advice.OnMethodExit(suppress = classOf[Throwable])
    def exit(@Advice.This self: AnyRef): Unit =
      // Class.forName + reflection (rather than a direct `classOf[CodedInputStream]`) keeps
      // the agent JAR independent of any specific protobuf-java version. The advice body
      // is inlined into the target constructor, where CodedInputStream is loaded by definition.
      val cis = Class.forName("com.google.protobuf.CodedInputStream")
      cis.getMethod("setRecursionLimit", java.lang.Integer.TYPE)
         .invoke(self, java.lang.Integer.valueOf(RecursionLimit))
