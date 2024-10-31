// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/encoder.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package net.jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializeencodeOutput")
public inline fun encodeOutput(block: net.jumpaku.exprml.pb.exprml.v1.EncodeOutputKt.Dsl.() -> kotlin.Unit): net.jumpaku.exprml.pb.exprml.v1.EncodeOutput =
  net.jumpaku.exprml.pb.exprml.v1.EncodeOutputKt.Dsl._create(net.jumpaku.exprml.pb.exprml.v1.EncodeOutput.newBuilder()).apply { block() }._build()
/**
 * ```
 * EncodeOutput is the output message for the Encode method.
 * ```
 *
 * Protobuf type `exprml.v1.EncodeOutput`
 */
public object EncodeOutputKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: net.jumpaku.exprml.pb.exprml.v1.EncodeOutput.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: net.jumpaku.exprml.pb.exprml.v1.EncodeOutput.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): net.jumpaku.exprml.pb.exprml.v1.EncodeOutput = _builder.build()

    /**
     * ```
     * Whether an error occurred during encoding.
     * ```
     *
     * `bool is_error = 1 [json_name = "isError"];`
     */
    public var isError: kotlin.Boolean
      @JvmName("getIsError")
      get() = _builder.isError
      @JvmName("setIsError")
      set(value) {
        _builder.isError = value
      }
    /**
     * ```
     * Whether an error occurred during encoding.
     * ```
     *
     * `bool is_error = 1 [json_name = "isError"];`
     */
    public fun clearIsError() {
      _builder.clearIsError()
    }

    /**
     * ```
     * Error message if is_error is true.
     * ```
     *
     * `string error_message = 2 [json_name = "errorMessage"];`
     */
    public var errorMessage: kotlin.String
      @JvmName("getErrorMessage")
      get() = _builder.errorMessage
      @JvmName("setErrorMessage")
      set(value) {
        _builder.errorMessage = value
      }
    /**
     * ```
     * Error message if is_error is true.
     * ```
     *
     * `string error_message = 2 [json_name = "errorMessage"];`
     */
    public fun clearErrorMessage() {
      _builder.clearErrorMessage()
    }

    /**
     * ```
     * Encoded string in JSON (or JSON-compatible YAML).
     * ```
     *
     * `string text = 3 [json_name = "text"];`
     */
    public var text: kotlin.String
      @JvmName("getText")
      get() = _builder.text
      @JvmName("setText")
      set(value) {
        _builder.text = value
      }
    /**
     * ```
     * Encoded string in JSON (or JSON-compatible YAML).
     * ```
     *
     * `string text = 3 [json_name = "text"];`
     */
    public fun clearText() {
      _builder.clearText()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun net.jumpaku.exprml.pb.exprml.v1.EncodeOutput.copy(block: `net.jumpaku.exprml.pb.exprml.v1`.EncodeOutputKt.Dsl.() -> kotlin.Unit): net.jumpaku.exprml.pb.exprml.v1.EncodeOutput =
  `net.jumpaku.exprml.pb.exprml.v1`.EncodeOutputKt.Dsl._create(this.toBuilder()).apply { block() }._build()

