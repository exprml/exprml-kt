// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/decoder.proto
// Protobuf Java Version: 4.28.2

package net.jumpaku.exprml.pb.exprml.v1;

/**
 * <pre>
 * DecodeInput is the input message for the Decode method.
 * </pre>
 *
 * Protobuf type {@code exprml.v1.DecodeInput}
 */
public final class DecodeInput extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:exprml.v1.DecodeInput)
    DecodeInputOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      DecodeInput.class.getName());
  }
  // Use DecodeInput.newBuilder() to construct.
  private DecodeInput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DecodeInput() {
    text_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.jumpaku.exprml.pb.exprml.v1.DecoderProto.internal_static_exprml_v1_DecodeInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.jumpaku.exprml.pb.exprml.v1.DecoderProto.internal_static_exprml_v1_DecodeInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.jumpaku.exprml.pb.exprml.v1.DecodeInput.class, net.jumpaku.exprml.pb.exprml.v1.DecodeInput.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * string in JSON (and JSON-compatible YAML).
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * string in JSON (and JSON-compatible YAML).
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, text_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, text_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.jumpaku.exprml.pb.exprml.v1.DecodeInput)) {
      return super.equals(obj);
    }
    net.jumpaku.exprml.pb.exprml.v1.DecodeInput other = (net.jumpaku.exprml.pb.exprml.v1.DecodeInput) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.jumpaku.exprml.pb.exprml.v1.DecodeInput prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * DecodeInput is the input message for the Decode method.
   * </pre>
   *
   * Protobuf type {@code exprml.v1.DecodeInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:exprml.v1.DecodeInput)
      net.jumpaku.exprml.pb.exprml.v1.DecodeInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.jumpaku.exprml.pb.exprml.v1.DecoderProto.internal_static_exprml_v1_DecodeInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.jumpaku.exprml.pb.exprml.v1.DecoderProto.internal_static_exprml_v1_DecodeInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.jumpaku.exprml.pb.exprml.v1.DecodeInput.class, net.jumpaku.exprml.pb.exprml.v1.DecodeInput.Builder.class);
    }

    // Construct using net.jumpaku.exprml.pb.exprml.v1.DecodeInput.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      text_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.jumpaku.exprml.pb.exprml.v1.DecoderProto.internal_static_exprml_v1_DecodeInput_descriptor;
    }

    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.DecodeInput getDefaultInstanceForType() {
      return net.jumpaku.exprml.pb.exprml.v1.DecodeInput.getDefaultInstance();
    }

    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.DecodeInput build() {
      net.jumpaku.exprml.pb.exprml.v1.DecodeInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.jumpaku.exprml.pb.exprml.v1.DecodeInput buildPartial() {
      net.jumpaku.exprml.pb.exprml.v1.DecodeInput result = new net.jumpaku.exprml.pb.exprml.v1.DecodeInput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(net.jumpaku.exprml.pb.exprml.v1.DecodeInput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.jumpaku.exprml.pb.exprml.v1.DecodeInput) {
        return mergeFrom((net.jumpaku.exprml.pb.exprml.v1.DecodeInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.jumpaku.exprml.pb.exprml.v1.DecodeInput other) {
      if (other == net.jumpaku.exprml.pb.exprml.v1.DecodeInput.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * string in JSON (and JSON-compatible YAML).
     * </pre>
     *
     * <code>string text = 1 [json_name = "text"];</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * string in JSON (and JSON-compatible YAML).
     * </pre>
     *
     * <code>string text = 1 [json_name = "text"];</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * string in JSON (and JSON-compatible YAML).
     * </pre>
     *
     * <code>string text = 1 [json_name = "text"];</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * string in JSON (and JSON-compatible YAML).
     * </pre>
     *
     * <code>string text = 1 [json_name = "text"];</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * string in JSON (and JSON-compatible YAML).
     * </pre>
     *
     * <code>string text = 1 [json_name = "text"];</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:exprml.v1.DecodeInput)
  }

  // @@protoc_insertion_point(class_scope:exprml.v1.DecodeInput)
  private static final net.jumpaku.exprml.pb.exprml.v1.DecodeInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.jumpaku.exprml.pb.exprml.v1.DecodeInput();
  }

  public static net.jumpaku.exprml.pb.exprml.v1.DecodeInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DecodeInput>
      PARSER = new com.google.protobuf.AbstractParser<DecodeInput>() {
    @java.lang.Override
    public DecodeInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DecodeInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DecodeInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.jumpaku.exprml.pb.exprml.v1.DecodeInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

