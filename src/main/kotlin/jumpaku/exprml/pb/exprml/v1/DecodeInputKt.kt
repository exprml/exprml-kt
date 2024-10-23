// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/decoder.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializedecodeInput")
public inline fun decodeInput(block: jumpaku.exprml.pb.exprml.v1.DecodeInputKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.DecodeInput =
  jumpaku.exprml.pb.exprml.v1.DecodeInputKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.DecodeInput.newBuilder()).apply { block() }._build()
/**
 * ```
 * DecodeInput is the input message for the Decode method.
 * ```
 *
 * Protobuf type `exprml.v1.DecodeInput`
 */
public object DecodeInputKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: jumpaku.exprml.pb.exprml.v1.DecodeInput.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.DecodeInput.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jumpaku.exprml.pb.exprml.v1.DecodeInput = _builder.build()

    /**
     * ```
     * YAML string to decode.
     * ```
     *
     * `string yaml = 1 [json_name = "yaml"];`
     */
    public var yaml: kotlin.String
      @JvmName("getYaml")
      get() = _builder.yaml
      @JvmName("setYaml")
      set(value) {
        _builder.yaml = value
      }
    /**
     * ```
     * YAML string to decode.
     * ```
     *
     * `string yaml = 1 [json_name = "yaml"];`
     */
    public fun clearYaml() {
      _builder.clearYaml()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.DecodeInput.copy(block: `jumpaku.exprml.pb.exprml.v1`.DecodeInputKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.DecodeInput =
  `jumpaku.exprml.pb.exprml.v1`.DecodeInputKt.Dsl._create(this.toBuilder()).apply { block() }._build()
