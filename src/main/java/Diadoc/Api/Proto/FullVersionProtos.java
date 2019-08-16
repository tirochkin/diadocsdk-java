// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FullVersion.proto

package Diadoc.Api.Proto;

public final class FullVersionProtos {
  private FullVersionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FullVersionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.FullVersion)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string TypeNamedId = 1;</code>
     */
    boolean hasTypeNamedId();
    /**
     * <code>required string TypeNamedId = 1;</code>
     */
    java.lang.String getTypeNamedId();
    /**
     * <code>required string TypeNamedId = 1;</code>
     */
    com.google.protobuf.ByteString
        getTypeNamedIdBytes();

    /**
     * <code>required string Function = 2;</code>
     */
    boolean hasFunction();
    /**
     * <code>required string Function = 2;</code>
     */
    java.lang.String getFunction();
    /**
     * <code>required string Function = 2;</code>
     */
    com.google.protobuf.ByteString
        getFunctionBytes();

    /**
     * <code>required string Version = 3;</code>
     */
    boolean hasVersion();
    /**
     * <code>required string Version = 3;</code>
     */
    java.lang.String getVersion();
    /**
     * <code>required string Version = 3;</code>
     */
    com.google.protobuf.ByteString
        getVersionBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.FullVersion}
   */
  public static final class FullVersion extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.FullVersion)
      FullVersionOrBuilder {
    // Use FullVersion.newBuilder() to construct.
    private FullVersion(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FullVersion(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FullVersion defaultInstance;
    public static FullVersion getDefaultInstance() {
      return defaultInstance;
    }

    public FullVersion getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FullVersion(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              typeNamedId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              function_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              version_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.FullVersionProtos.internal_static_Diadoc_Api_Proto_FullVersion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.FullVersionProtos.internal_static_Diadoc_Api_Proto_FullVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.FullVersionProtos.FullVersion.class, Diadoc.Api.Proto.FullVersionProtos.FullVersion.Builder.class);
    }

    public static com.google.protobuf.Parser<FullVersion> PARSER =
        new com.google.protobuf.AbstractParser<FullVersion>() {
      public FullVersion parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FullVersion(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FullVersion> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPENAMEDID_FIELD_NUMBER = 1;
    private java.lang.Object typeNamedId_;
    /**
     * <code>required string TypeNamedId = 1;</code>
     */
    public boolean hasTypeNamedId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string TypeNamedId = 1;</code>
     */
    public java.lang.String getTypeNamedId() {
      java.lang.Object ref = typeNamedId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          typeNamedId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string TypeNamedId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeNamedIdBytes() {
      java.lang.Object ref = typeNamedId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeNamedId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FUNCTION_FIELD_NUMBER = 2;
    private java.lang.Object function_;
    /**
     * <code>required string Function = 2;</code>
     */
    public boolean hasFunction() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string Function = 2;</code>
     */
    public java.lang.String getFunction() {
      java.lang.Object ref = function_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          function_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Function = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFunctionBytes() {
      java.lang.Object ref = function_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        function_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSION_FIELD_NUMBER = 3;
    private java.lang.Object version_;
    /**
     * <code>required string Version = 3;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string Version = 3;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          version_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Version = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      typeNamedId_ = "";
      function_ = "";
      version_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTypeNamedId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFunction()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTypeNamedIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getFunctionBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getVersionBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTypeNamedIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFunctionBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getVersionBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.FullVersionProtos.FullVersion parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.FullVersionProtos.FullVersion prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Diadoc.Api.Proto.FullVersion}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.FullVersion)
        Diadoc.Api.Proto.FullVersionProtos.FullVersionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.FullVersionProtos.internal_static_Diadoc_Api_Proto_FullVersion_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.FullVersionProtos.internal_static_Diadoc_Api_Proto_FullVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.FullVersionProtos.FullVersion.class, Diadoc.Api.Proto.FullVersionProtos.FullVersion.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.FullVersionProtos.FullVersion.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        typeNamedId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        function_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        version_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.FullVersionProtos.internal_static_Diadoc_Api_Proto_FullVersion_descriptor;
      }

      public Diadoc.Api.Proto.FullVersionProtos.FullVersion getDefaultInstanceForType() {
        return Diadoc.Api.Proto.FullVersionProtos.FullVersion.getDefaultInstance();
      }

      public Diadoc.Api.Proto.FullVersionProtos.FullVersion build() {
        Diadoc.Api.Proto.FullVersionProtos.FullVersion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.FullVersionProtos.FullVersion buildPartial() {
        Diadoc.Api.Proto.FullVersionProtos.FullVersion result = new Diadoc.Api.Proto.FullVersionProtos.FullVersion(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.typeNamedId_ = typeNamedId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.function_ = function_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.version_ = version_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.FullVersionProtos.FullVersion) {
          return mergeFrom((Diadoc.Api.Proto.FullVersionProtos.FullVersion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.FullVersionProtos.FullVersion other) {
        if (other == Diadoc.Api.Proto.FullVersionProtos.FullVersion.getDefaultInstance()) return this;
        if (other.hasTypeNamedId()) {
          bitField0_ |= 0x00000001;
          typeNamedId_ = other.typeNamedId_;
          onChanged();
        }
        if (other.hasFunction()) {
          bitField0_ |= 0x00000002;
          function_ = other.function_;
          onChanged();
        }
        if (other.hasVersion()) {
          bitField0_ |= 0x00000004;
          version_ = other.version_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTypeNamedId()) {
          
          return false;
        }
        if (!hasFunction()) {
          
          return false;
        }
        if (!hasVersion()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.FullVersionProtos.FullVersion parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.FullVersionProtos.FullVersion) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object typeNamedId_ = "";
      /**
       * <code>required string TypeNamedId = 1;</code>
       */
      public boolean hasTypeNamedId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string TypeNamedId = 1;</code>
       */
      public java.lang.String getTypeNamedId() {
        java.lang.Object ref = typeNamedId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            typeNamedId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string TypeNamedId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTypeNamedIdBytes() {
        java.lang.Object ref = typeNamedId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          typeNamedId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string TypeNamedId = 1;</code>
       */
      public Builder setTypeNamedId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        typeNamedId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string TypeNamedId = 1;</code>
       */
      public Builder clearTypeNamedId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        typeNamedId_ = getDefaultInstance().getTypeNamedId();
        onChanged();
        return this;
      }
      /**
       * <code>required string TypeNamedId = 1;</code>
       */
      public Builder setTypeNamedIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        typeNamedId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object function_ = "";
      /**
       * <code>required string Function = 2;</code>
       */
      public boolean hasFunction() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string Function = 2;</code>
       */
      public java.lang.String getFunction() {
        java.lang.Object ref = function_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            function_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Function = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFunctionBytes() {
        java.lang.Object ref = function_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          function_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Function = 2;</code>
       */
      public Builder setFunction(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        function_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Function = 2;</code>
       */
      public Builder clearFunction() {
        bitField0_ = (bitField0_ & ~0x00000002);
        function_ = getDefaultInstance().getFunction();
        onChanged();
        return this;
      }
      /**
       * <code>required string Function = 2;</code>
       */
      public Builder setFunctionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        function_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object version_ = "";
      /**
       * <code>required string Version = 3;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string Version = 3;</code>
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            version_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Version = 3;</code>
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Version = 3;</code>
       */
      public Builder setVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Version = 3;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       * <code>required string Version = 3;</code>
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        version_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.FullVersion)
    }

    static {
      defaultInstance = new FullVersion(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.FullVersion)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_FullVersion_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_FullVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FullVersion.proto\022\020Diadoc.Api.Proto\"E\n" +
      "\013FullVersion\022\023\n\013TypeNamedId\030\001 \002(\t\022\020\n\010Fun" +
      "ction\030\002 \002(\t\022\017\n\007Version\030\003 \002(\tB\023B\021FullVers" +
      "ionProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Diadoc_Api_Proto_FullVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_FullVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_FullVersion_descriptor,
        new java.lang.String[] { "TypeNamedId", "Function", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}