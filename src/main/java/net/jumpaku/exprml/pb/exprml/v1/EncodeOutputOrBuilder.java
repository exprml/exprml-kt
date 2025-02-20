// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/encoder.proto
// Protobuf Java Version: 4.28.2

package net.jumpaku.exprml.pb.exprml.v1;

public interface EncodeOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:exprml.v1.EncodeOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether an error occurred during encoding.
   * </pre>
   *
   * <code>bool is_error = 1 [json_name = "isError"];</code>
   * @return The isError.
   */
  boolean getIsError();

  /**
   * <pre>
   * Error message if is_error is true.
   * </pre>
   *
   * <code>string error_message = 2 [json_name = "errorMessage"];</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * Error message if is_error is true.
   * </pre>
   *
   * <code>string error_message = 2 [json_name = "errorMessage"];</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <pre>
   * Encoded string in JSON (or JSON-compatible YAML).
   * </pre>
   *
   * <code>string text = 3 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Encoded string in JSON (or JSON-compatible YAML).
   * </pre>
   *
   * <code>string text = 3 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
