// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main.proto

package edu.washington.escience.myriad.proto;

public final class TransportProto {
  private TransportProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TransportMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .TransportMessage.TransportMessageType type = 1;
    boolean hasType();
    edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType getType();
    
    // optional .DataMessage data = 2;
    boolean hasData();
    edu.washington.escience.myriad.proto.DataProto.DataMessage getData();
    edu.washington.escience.myriad.proto.DataProto.DataMessageOrBuilder getDataOrBuilder();
    
    // optional .Query query = 4;
    boolean hasQuery();
    edu.washington.escience.myriad.proto.QueryProto.Query getQuery();
    edu.washington.escience.myriad.proto.QueryProto.QueryOrBuilder getQueryOrBuilder();
    
    // optional .ControlMessage control = 5;
    boolean hasControl();
    edu.washington.escience.myriad.proto.ControlProto.ControlMessage getControl();
    edu.washington.escience.myriad.proto.ControlProto.ControlMessageOrBuilder getControlOrBuilder();
  }
  public static final class TransportMessage extends
      com.google.protobuf.GeneratedMessage
      implements TransportMessageOrBuilder {
    // Use TransportMessage.newBuilder() to construct.
    private TransportMessage(Builder builder) {
      super(builder);
    }
    private TransportMessage(boolean noInit) {}
    
    private static final TransportMessage defaultInstance;
    public static TransportMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public TransportMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.washington.escience.myriad.proto.TransportProto.internal_static_TransportMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.washington.escience.myriad.proto.TransportProto.internal_static_TransportMessage_fieldAccessorTable;
    }
    
    public enum TransportMessageType
        implements com.google.protobuf.ProtocolMessageEnum {
      DATA(0, 0),
      QUERY(1, 1),
      CONTROL(2, 2),
      ;
      
      public static final int DATA_VALUE = 0;
      public static final int QUERY_VALUE = 1;
      public static final int CONTROL_VALUE = 2;
      
      
      public final int getNumber() { return value; }
      
      public static TransportMessageType valueOf(int value) {
        switch (value) {
          case 0: return DATA;
          case 1: return QUERY;
          case 2: return CONTROL;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<TransportMessageType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<TransportMessageType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<TransportMessageType>() {
              public TransportMessageType findValueByNumber(int number) {
                return TransportMessageType.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return edu.washington.escience.myriad.proto.TransportProto.TransportMessage.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final TransportMessageType[] VALUES = {
        DATA, QUERY, CONTROL, 
      };
      
      public static TransportMessageType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private TransportMessageType(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:TransportMessage.TransportMessageType)
    }
    
    private int bitField0_;
    // required .TransportMessage.TransportMessageType type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType getType() {
      return type_;
    }
    
    // optional .DataMessage data = 2;
    public static final int DATA_FIELD_NUMBER = 2;
    private edu.washington.escience.myriad.proto.DataProto.DataMessage data_;
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public edu.washington.escience.myriad.proto.DataProto.DataMessage getData() {
      return data_;
    }
    public edu.washington.escience.myriad.proto.DataProto.DataMessageOrBuilder getDataOrBuilder() {
      return data_;
    }
    
    // optional .Query query = 4;
    public static final int QUERY_FIELD_NUMBER = 4;
    private edu.washington.escience.myriad.proto.QueryProto.Query query_;
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public edu.washington.escience.myriad.proto.QueryProto.Query getQuery() {
      return query_;
    }
    public edu.washington.escience.myriad.proto.QueryProto.QueryOrBuilder getQueryOrBuilder() {
      return query_;
    }
    
    // optional .ControlMessage control = 5;
    public static final int CONTROL_FIELD_NUMBER = 5;
    private edu.washington.escience.myriad.proto.ControlProto.ControlMessage control_;
    public boolean hasControl() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public edu.washington.escience.myriad.proto.ControlProto.ControlMessage getControl() {
      return control_;
    }
    public edu.washington.escience.myriad.proto.ControlProto.ControlMessageOrBuilder getControlOrBuilder() {
      return control_;
    }
    
    private void initFields() {
      type_ = edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType.DATA;
      data_ = edu.washington.escience.myriad.proto.DataProto.DataMessage.getDefaultInstance();
      query_ = edu.washington.escience.myriad.proto.QueryProto.Query.getDefaultInstance();
      control_ = edu.washington.escience.myriad.proto.ControlProto.ControlMessage.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasData()) {
        if (!getData().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasQuery()) {
        if (!getQuery().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasControl()) {
        if (!getControl().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(4, query_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(5, control_);
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
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, query_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, control_);
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
    
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static edu.washington.escience.myriad.proto.TransportProto.TransportMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(edu.washington.escience.myriad.proto.TransportProto.TransportMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements edu.washington.escience.myriad.proto.TransportProto.TransportMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return edu.washington.escience.myriad.proto.TransportProto.internal_static_TransportMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return edu.washington.escience.myriad.proto.TransportProto.internal_static_TransportMessage_fieldAccessorTable;
      }
      
      // Construct using edu.washington.escience.myriad.proto.TransportProto.TransportMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getDataFieldBuilder();
          getQueryFieldBuilder();
          getControlFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType.DATA;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (dataBuilder_ == null) {
          data_ = edu.washington.escience.myriad.proto.DataProto.DataMessage.getDefaultInstance();
        } else {
          dataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (queryBuilder_ == null) {
          query_ = edu.washington.escience.myriad.proto.QueryProto.Query.getDefaultInstance();
        } else {
          queryBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (controlBuilder_ == null) {
          control_ = edu.washington.escience.myriad.proto.ControlProto.ControlMessage.getDefaultInstance();
        } else {
          controlBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return edu.washington.escience.myriad.proto.TransportProto.TransportMessage.getDescriptor();
      }
      
      public edu.washington.escience.myriad.proto.TransportProto.TransportMessage getDefaultInstanceForType() {
        return edu.washington.escience.myriad.proto.TransportProto.TransportMessage.getDefaultInstance();
      }
      
      public edu.washington.escience.myriad.proto.TransportProto.TransportMessage build() {
        edu.washington.escience.myriad.proto.TransportProto.TransportMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private edu.washington.escience.myriad.proto.TransportProto.TransportMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        edu.washington.escience.myriad.proto.TransportProto.TransportMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public edu.washington.escience.myriad.proto.TransportProto.TransportMessage buildPartial() {
        edu.washington.escience.myriad.proto.TransportProto.TransportMessage result = new edu.washington.escience.myriad.proto.TransportProto.TransportMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (queryBuilder_ == null) {
          result.query_ = query_;
        } else {
          result.query_ = queryBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (controlBuilder_ == null) {
          result.control_ = control_;
        } else {
          result.control_ = controlBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof edu.washington.escience.myriad.proto.TransportProto.TransportMessage) {
          return mergeFrom((edu.washington.escience.myriad.proto.TransportProto.TransportMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(edu.washington.escience.myriad.proto.TransportProto.TransportMessage other) {
        if (other == edu.washington.escience.myriad.proto.TransportProto.TransportMessage.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasData()) {
          mergeData(other.getData());
        }
        if (other.hasQuery()) {
          mergeQuery(other.getQuery());
        }
        if (other.hasControl()) {
          mergeControl(other.getControl());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (hasData()) {
          if (!getData().isInitialized()) {
            
            return false;
          }
        }
        if (hasQuery()) {
          if (!getQuery().isInitialized()) {
            
            return false;
          }
        }
        if (hasControl()) {
          if (!getControl().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType value = edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 18: {
              edu.washington.escience.myriad.proto.DataProto.DataMessage.Builder subBuilder = edu.washington.escience.myriad.proto.DataProto.DataMessage.newBuilder();
              if (hasData()) {
                subBuilder.mergeFrom(getData());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setData(subBuilder.buildPartial());
              break;
            }
            case 34: {
              edu.washington.escience.myriad.proto.QueryProto.Query.Builder subBuilder = edu.washington.escience.myriad.proto.QueryProto.Query.newBuilder();
              if (hasQuery()) {
                subBuilder.mergeFrom(getQuery());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setQuery(subBuilder.buildPartial());
              break;
            }
            case 42: {
              edu.washington.escience.myriad.proto.ControlProto.ControlMessage.Builder subBuilder = edu.washington.escience.myriad.proto.ControlProto.ControlMessage.newBuilder();
              if (hasControl()) {
                subBuilder.mergeFrom(getControl());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setControl(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .TransportMessage.TransportMessageType type = 1;
      private edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType type_ = edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType.DATA;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType getType() {
        return type_;
      }
      public Builder setType(edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = edu.washington.escience.myriad.proto.TransportProto.TransportMessage.TransportMessageType.DATA;
        onChanged();
        return this;
      }
      
      // optional .DataMessage data = 2;
      private edu.washington.escience.myriad.proto.DataProto.DataMessage data_ = edu.washington.escience.myriad.proto.DataProto.DataMessage.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          edu.washington.escience.myriad.proto.DataProto.DataMessage, edu.washington.escience.myriad.proto.DataProto.DataMessage.Builder, edu.washington.escience.myriad.proto.DataProto.DataMessageOrBuilder> dataBuilder_;
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public edu.washington.escience.myriad.proto.DataProto.DataMessage getData() {
        if (dataBuilder_ == null) {
          return data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      public Builder setData(edu.washington.escience.myriad.proto.DataProto.DataMessage value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setData(
          edu.washington.escience.myriad.proto.DataProto.DataMessage.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeData(edu.washington.escience.myriad.proto.DataProto.DataMessage value) {
        if (dataBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              data_ != edu.washington.escience.myriad.proto.DataProto.DataMessage.getDefaultInstance()) {
            data_ =
              edu.washington.escience.myriad.proto.DataProto.DataMessage.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = edu.washington.escience.myriad.proto.DataProto.DataMessage.getDefaultInstance();
          onChanged();
        } else {
          dataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public edu.washington.escience.myriad.proto.DataProto.DataMessage.Builder getDataBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      public edu.washington.escience.myriad.proto.DataProto.DataMessageOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          edu.washington.escience.myriad.proto.DataProto.DataMessage, edu.washington.escience.myriad.proto.DataProto.DataMessage.Builder, edu.washington.escience.myriad.proto.DataProto.DataMessageOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              edu.washington.escience.myriad.proto.DataProto.DataMessage, edu.washington.escience.myriad.proto.DataProto.DataMessage.Builder, edu.washington.escience.myriad.proto.DataProto.DataMessageOrBuilder>(
                  data_,
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
      }
      
      // optional .Query query = 4;
      private edu.washington.escience.myriad.proto.QueryProto.Query query_ = edu.washington.escience.myriad.proto.QueryProto.Query.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          edu.washington.escience.myriad.proto.QueryProto.Query, edu.washington.escience.myriad.proto.QueryProto.Query.Builder, edu.washington.escience.myriad.proto.QueryProto.QueryOrBuilder> queryBuilder_;
      public boolean hasQuery() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public edu.washington.escience.myriad.proto.QueryProto.Query getQuery() {
        if (queryBuilder_ == null) {
          return query_;
        } else {
          return queryBuilder_.getMessage();
        }
      }
      public Builder setQuery(edu.washington.escience.myriad.proto.QueryProto.Query value) {
        if (queryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          query_ = value;
          onChanged();
        } else {
          queryBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setQuery(
          edu.washington.escience.myriad.proto.QueryProto.Query.Builder builderForValue) {
        if (queryBuilder_ == null) {
          query_ = builderForValue.build();
          onChanged();
        } else {
          queryBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergeQuery(edu.washington.escience.myriad.proto.QueryProto.Query value) {
        if (queryBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              query_ != edu.washington.escience.myriad.proto.QueryProto.Query.getDefaultInstance()) {
            query_ =
              edu.washington.escience.myriad.proto.QueryProto.Query.newBuilder(query_).mergeFrom(value).buildPartial();
          } else {
            query_ = value;
          }
          onChanged();
        } else {
          queryBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearQuery() {
        if (queryBuilder_ == null) {
          query_ = edu.washington.escience.myriad.proto.QueryProto.Query.getDefaultInstance();
          onChanged();
        } else {
          queryBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      public edu.washington.escience.myriad.proto.QueryProto.Query.Builder getQueryBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getQueryFieldBuilder().getBuilder();
      }
      public edu.washington.escience.myriad.proto.QueryProto.QueryOrBuilder getQueryOrBuilder() {
        if (queryBuilder_ != null) {
          return queryBuilder_.getMessageOrBuilder();
        } else {
          return query_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          edu.washington.escience.myriad.proto.QueryProto.Query, edu.washington.escience.myriad.proto.QueryProto.Query.Builder, edu.washington.escience.myriad.proto.QueryProto.QueryOrBuilder> 
          getQueryFieldBuilder() {
        if (queryBuilder_ == null) {
          queryBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              edu.washington.escience.myriad.proto.QueryProto.Query, edu.washington.escience.myriad.proto.QueryProto.Query.Builder, edu.washington.escience.myriad.proto.QueryProto.QueryOrBuilder>(
                  query_,
                  getParentForChildren(),
                  isClean());
          query_ = null;
        }
        return queryBuilder_;
      }
      
      // optional .ControlMessage control = 5;
      private edu.washington.escience.myriad.proto.ControlProto.ControlMessage control_ = edu.washington.escience.myriad.proto.ControlProto.ControlMessage.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          edu.washington.escience.myriad.proto.ControlProto.ControlMessage, edu.washington.escience.myriad.proto.ControlProto.ControlMessage.Builder, edu.washington.escience.myriad.proto.ControlProto.ControlMessageOrBuilder> controlBuilder_;
      public boolean hasControl() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public edu.washington.escience.myriad.proto.ControlProto.ControlMessage getControl() {
        if (controlBuilder_ == null) {
          return control_;
        } else {
          return controlBuilder_.getMessage();
        }
      }
      public Builder setControl(edu.washington.escience.myriad.proto.ControlProto.ControlMessage value) {
        if (controlBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          control_ = value;
          onChanged();
        } else {
          controlBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder setControl(
          edu.washington.escience.myriad.proto.ControlProto.ControlMessage.Builder builderForValue) {
        if (controlBuilder_ == null) {
          control_ = builderForValue.build();
          onChanged();
        } else {
          controlBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder mergeControl(edu.washington.escience.myriad.proto.ControlProto.ControlMessage value) {
        if (controlBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              control_ != edu.washington.escience.myriad.proto.ControlProto.ControlMessage.getDefaultInstance()) {
            control_ =
              edu.washington.escience.myriad.proto.ControlProto.ControlMessage.newBuilder(control_).mergeFrom(value).buildPartial();
          } else {
            control_ = value;
          }
          onChanged();
        } else {
          controlBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder clearControl() {
        if (controlBuilder_ == null) {
          control_ = edu.washington.escience.myriad.proto.ControlProto.ControlMessage.getDefaultInstance();
          onChanged();
        } else {
          controlBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      public edu.washington.escience.myriad.proto.ControlProto.ControlMessage.Builder getControlBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getControlFieldBuilder().getBuilder();
      }
      public edu.washington.escience.myriad.proto.ControlProto.ControlMessageOrBuilder getControlOrBuilder() {
        if (controlBuilder_ != null) {
          return controlBuilder_.getMessageOrBuilder();
        } else {
          return control_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          edu.washington.escience.myriad.proto.ControlProto.ControlMessage, edu.washington.escience.myriad.proto.ControlProto.ControlMessage.Builder, edu.washington.escience.myriad.proto.ControlProto.ControlMessageOrBuilder> 
          getControlFieldBuilder() {
        if (controlBuilder_ == null) {
          controlBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              edu.washington.escience.myriad.proto.ControlProto.ControlMessage, edu.washington.escience.myriad.proto.ControlProto.ControlMessage.Builder, edu.washington.escience.myriad.proto.ControlProto.ControlMessageOrBuilder>(
                  control_,
                  getParentForChildren(),
                  isClean());
          control_ = null;
        }
        return controlBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:TransportMessage)
    }
    
    static {
      defaultInstance = new TransportMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TransportMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TransportMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TransportMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nmain.proto\032\014column.proto\032\rcontrol.prot" +
      "o\032\013query.proto\"\327\001\n\020TransportMessage\0224\n\004t" +
      "ype\030\001 \002(\0162&.TransportMessage.TransportMe" +
      "ssageType\022\032\n\004data\030\002 \001(\0132\014.DataMessage\022\025\n" +
      "\005query\030\004 \001(\0132\006.Query\022 \n\007control\030\005 \001(\0132\017." +
      "ControlMessage\"8\n\024TransportMessageType\022\010" +
      "\n\004DATA\020\000\022\t\n\005QUERY\020\001\022\013\n\007CONTROL\020\002B6\n$edu." +
      "washington.escience.myriad.protoB\016Transp" +
      "ortProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TransportMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TransportMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TransportMessage_descriptor,
              new java.lang.String[] { "Type", "Data", "Query", "Control", },
              edu.washington.escience.myriad.proto.TransportProto.TransportMessage.class,
              edu.washington.escience.myriad.proto.TransportProto.TransportMessage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          edu.washington.escience.myriad.proto.DataProto.getDescriptor(),
          edu.washington.escience.myriad.proto.ControlProto.getDescriptor(),
          edu.washington.escience.myriad.proto.QueryProto.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}