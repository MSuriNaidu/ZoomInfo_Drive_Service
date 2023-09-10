// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_service.proto

package com.zoominfo.drive;

/**
 * Protobuf type {@code file_service.UploadFolderRequest}
 */
public  final class UploadFolderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:file_service.UploadFolderRequest)
    UploadFolderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadFolderRequest.newBuilder() to construct.
  private UploadFolderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadFolderRequest() {
    token_ = "";
    folderName_ = "";
    files_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UploadFolderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            folderName_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              files_ = new java.util.ArrayList<com.zoominfo.drive.UploadFileRequest>();
              mutable_bitField0_ |= 0x00000004;
            }
            files_.add(
                input.readMessage(com.zoominfo.drive.UploadFileRequest.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        files_ = java.util.Collections.unmodifiableList(files_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zoominfo.drive.FileServiceProto.internal_static_file_service_UploadFolderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zoominfo.drive.FileServiceProto.internal_static_file_service_UploadFolderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zoominfo.drive.UploadFolderRequest.class, com.zoominfo.drive.UploadFolderRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object token_;
  /**
   * <code>string token = 1;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FOLDERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object folderName_;
  /**
   * <code>string folderName = 2;</code>
   */
  public java.lang.String getFolderName() {
    java.lang.Object ref = folderName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      folderName_ = s;
      return s;
    }
  }
  /**
   * <code>string folderName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFolderNameBytes() {
    java.lang.Object ref = folderName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      folderName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILES_FIELD_NUMBER = 3;
  private java.util.List<com.zoominfo.drive.UploadFileRequest> files_;
  /**
   * <code>repeated .file_service.UploadFileRequest files = 3;</code>
   */
  public java.util.List<com.zoominfo.drive.UploadFileRequest> getFilesList() {
    return files_;
  }
  /**
   * <code>repeated .file_service.UploadFileRequest files = 3;</code>
   */
  public java.util.List<? extends com.zoominfo.drive.UploadFileRequestOrBuilder> 
      getFilesOrBuilderList() {
    return files_;
  }
  /**
   * <code>repeated .file_service.UploadFileRequest files = 3;</code>
   */
  public int getFilesCount() {
    return files_.size();
  }
  /**
   * <code>repeated .file_service.UploadFileRequest files = 3;</code>
   */
  public com.zoominfo.drive.UploadFileRequest getFiles(int index) {
    return files_.get(index);
  }
  /**
   * <code>repeated .file_service.UploadFileRequest files = 3;</code>
   */
  public com.zoominfo.drive.UploadFileRequestOrBuilder getFilesOrBuilder(
      int index) {
    return files_.get(index);
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
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
    }
    if (!getFolderNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, folderName_);
    }
    for (int i = 0; i < files_.size(); i++) {
      output.writeMessage(3, files_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
    }
    if (!getFolderNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, folderName_);
    }
    for (int i = 0; i < files_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, files_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.zoominfo.drive.UploadFolderRequest)) {
      return super.equals(obj);
    }
    com.zoominfo.drive.UploadFolderRequest other = (com.zoominfo.drive.UploadFolderRequest) obj;

    boolean result = true;
    result = result && getToken()
        .equals(other.getToken());
    result = result && getFolderName()
        .equals(other.getFolderName());
    result = result && getFilesList()
        .equals(other.getFilesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + FOLDERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFolderName().hashCode();
    if (getFilesCount() > 0) {
      hash = (37 * hash) + FILES_FIELD_NUMBER;
      hash = (53 * hash) + getFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zoominfo.drive.UploadFolderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.zoominfo.drive.UploadFolderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code file_service.UploadFolderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:file_service.UploadFolderRequest)
      com.zoominfo.drive.UploadFolderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zoominfo.drive.FileServiceProto.internal_static_file_service_UploadFolderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zoominfo.drive.FileServiceProto.internal_static_file_service_UploadFolderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zoominfo.drive.UploadFolderRequest.class, com.zoominfo.drive.UploadFolderRequest.Builder.class);
    }

    // Construct using com.zoominfo.drive.UploadFolderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFilesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      token_ = "";

      folderName_ = "";

      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        filesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zoominfo.drive.FileServiceProto.internal_static_file_service_UploadFolderRequest_descriptor;
    }

    @java.lang.Override
    public com.zoominfo.drive.UploadFolderRequest getDefaultInstanceForType() {
      return com.zoominfo.drive.UploadFolderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zoominfo.drive.UploadFolderRequest build() {
      com.zoominfo.drive.UploadFolderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zoominfo.drive.UploadFolderRequest buildPartial() {
      com.zoominfo.drive.UploadFolderRequest result = new com.zoominfo.drive.UploadFolderRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.token_ = token_;
      result.folderName_ = folderName_;
      if (filesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          files_ = java.util.Collections.unmodifiableList(files_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.files_ = files_;
      } else {
        result.files_ = filesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zoominfo.drive.UploadFolderRequest) {
        return mergeFrom((com.zoominfo.drive.UploadFolderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zoominfo.drive.UploadFolderRequest other) {
      if (other == com.zoominfo.drive.UploadFolderRequest.getDefaultInstance()) return this;
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (!other.getFolderName().isEmpty()) {
        folderName_ = other.folderName_;
        onChanged();
      }
      if (filesBuilder_ == null) {
        if (!other.files_.isEmpty()) {
          if (files_.isEmpty()) {
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureFilesIsMutable();
            files_.addAll(other.files_);
          }
          onChanged();
        }
      } else {
        if (!other.files_.isEmpty()) {
          if (filesBuilder_.isEmpty()) {
            filesBuilder_.dispose();
            filesBuilder_ = null;
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000004);
            filesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFilesFieldBuilder() : null;
          } else {
            filesBuilder_.addAllMessages(other.files_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.zoominfo.drive.UploadFolderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zoominfo.drive.UploadFolderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 1;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 1;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object folderName_ = "";
    /**
     * <code>string folderName = 2;</code>
     */
    public java.lang.String getFolderName() {
      java.lang.Object ref = folderName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        folderName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string folderName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFolderNameBytes() {
      java.lang.Object ref = folderName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        folderName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string folderName = 2;</code>
     */
    public Builder setFolderName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      folderName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string folderName = 2;</code>
     */
    public Builder clearFolderName() {
      
      folderName_ = getDefaultInstance().getFolderName();
      onChanged();
      return this;
    }
    /**
     * <code>string folderName = 2;</code>
     */
    public Builder setFolderNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      folderName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.zoominfo.drive.UploadFileRequest> files_ =
      java.util.Collections.emptyList();
    private void ensureFilesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        files_ = new java.util.ArrayList<com.zoominfo.drive.UploadFileRequest>(files_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zoominfo.drive.UploadFileRequest, com.zoominfo.drive.UploadFileRequest.Builder, com.zoominfo.drive.UploadFileRequestOrBuilder> filesBuilder_;

    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public java.util.List<com.zoominfo.drive.UploadFileRequest> getFilesList() {
      if (filesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(files_);
      } else {
        return filesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public int getFilesCount() {
      if (filesBuilder_ == null) {
        return files_.size();
      } else {
        return filesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public com.zoominfo.drive.UploadFileRequest getFiles(int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);
      } else {
        return filesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder setFiles(
        int index, com.zoominfo.drive.UploadFileRequest value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.set(index, value);
        onChanged();
      } else {
        filesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder setFiles(
        int index, com.zoominfo.drive.UploadFileRequest.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.set(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder addFiles(com.zoominfo.drive.UploadFileRequest value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(value);
        onChanged();
      } else {
        filesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder addFiles(
        int index, com.zoominfo.drive.UploadFileRequest value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(index, value);
        onChanged();
      } else {
        filesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder addFiles(
        com.zoominfo.drive.UploadFileRequest.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder addFiles(
        int index, com.zoominfo.drive.UploadFileRequest.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder addAllFiles(
        java.lang.Iterable<? extends com.zoominfo.drive.UploadFileRequest> values) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, files_);
        onChanged();
      } else {
        filesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder clearFiles() {
      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        filesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public Builder removeFiles(int index) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.remove(index);
        onChanged();
      } else {
        filesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public com.zoominfo.drive.UploadFileRequest.Builder getFilesBuilder(
        int index) {
      return getFilesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public com.zoominfo.drive.UploadFileRequestOrBuilder getFilesOrBuilder(
        int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);  } else {
        return filesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public java.util.List<? extends com.zoominfo.drive.UploadFileRequestOrBuilder> 
         getFilesOrBuilderList() {
      if (filesBuilder_ != null) {
        return filesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(files_);
      }
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public com.zoominfo.drive.UploadFileRequest.Builder addFilesBuilder() {
      return getFilesFieldBuilder().addBuilder(
          com.zoominfo.drive.UploadFileRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public com.zoominfo.drive.UploadFileRequest.Builder addFilesBuilder(
        int index) {
      return getFilesFieldBuilder().addBuilder(
          index, com.zoominfo.drive.UploadFileRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .file_service.UploadFileRequest files = 3;</code>
     */
    public java.util.List<com.zoominfo.drive.UploadFileRequest.Builder> 
         getFilesBuilderList() {
      return getFilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zoominfo.drive.UploadFileRequest, com.zoominfo.drive.UploadFileRequest.Builder, com.zoominfo.drive.UploadFileRequestOrBuilder> 
        getFilesFieldBuilder() {
      if (filesBuilder_ == null) {
        filesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.zoominfo.drive.UploadFileRequest, com.zoominfo.drive.UploadFileRequest.Builder, com.zoominfo.drive.UploadFileRequestOrBuilder>(
                files_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        files_ = null;
      }
      return filesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:file_service.UploadFolderRequest)
  }

  // @@protoc_insertion_point(class_scope:file_service.UploadFolderRequest)
  private static final com.zoominfo.drive.UploadFolderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zoominfo.drive.UploadFolderRequest();
  }

  public static com.zoominfo.drive.UploadFolderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadFolderRequest>
      PARSER = new com.google.protobuf.AbstractParser<UploadFolderRequest>() {
    @java.lang.Override
    public UploadFolderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UploadFolderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UploadFolderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadFolderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zoominfo.drive.UploadFolderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
