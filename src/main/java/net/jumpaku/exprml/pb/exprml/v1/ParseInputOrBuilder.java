// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/parser.proto
// Protobuf Java Version: 4.28.2

package net.jumpaku.exprml.pb.exprml.v1;

public interface ParseInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:exprml.v1.ParseInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * JSON value to parse.
   * </pre>
   *
   * <code>.exprml.v1.Value value = 1 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * JSON value to parse.
   * </pre>
   *
   * <code>.exprml.v1.Value value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  net.jumpaku.exprml.pb.exprml.v1.Value getValue();
  /**
   * <pre>
   * JSON value to parse.
   * </pre>
   *
   * <code>.exprml.v1.Value value = 1 [json_name = "value"];</code>
   */
  net.jumpaku.exprml.pb.exprml.v1.ValueOrBuilder getValueOrBuilder();
}