// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/criteria.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * Criterion for length of hotel stay in nights.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.HotelLengthOfStayInfo}
 */
public  final class HotelLengthOfStayInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.HotelLengthOfStayInfo)
    HotelLengthOfStayInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelLengthOfStayInfo.newBuilder() to construct.
  private HotelLengthOfStayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelLengthOfStayInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelLengthOfStayInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelLengthOfStayInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (minNights_ != null) {
              subBuilder = minNights_.toBuilder();
            }
            minNights_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(minNights_);
              minNights_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (maxNights_ != null) {
              subBuilder = maxNights_.toBuilder();
            }
            maxNights_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxNights_);
              maxNights_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelLengthOfStayInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelLengthOfStayInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.class, com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.Builder.class);
  }

  public static final int MIN_NIGHTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value minNights_;
  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_nights = 1;</code>
   * @return Whether the minNights field is set.
   */
  public boolean hasMinNights() {
    return minNights_ != null;
  }
  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_nights = 1;</code>
   * @return The minNights.
   */
  public com.google.protobuf.Int64Value getMinNights() {
    return minNights_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : minNights_;
  }
  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_nights = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getMinNightsOrBuilder() {
    return getMinNights();
  }

  public static final int MAX_NIGHTS_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value maxNights_;
  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_nights = 2;</code>
   * @return Whether the maxNights field is set.
   */
  public boolean hasMaxNights() {
    return maxNights_ != null;
  }
  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_nights = 2;</code>
   * @return The maxNights.
   */
  public com.google.protobuf.Int64Value getMaxNights() {
    return maxNights_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : maxNights_;
  }
  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_nights = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getMaxNightsOrBuilder() {
    return getMaxNights();
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
    if (minNights_ != null) {
      output.writeMessage(1, getMinNights());
    }
    if (maxNights_ != null) {
      output.writeMessage(2, getMaxNights());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minNights_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMinNights());
    }
    if (maxNights_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaxNights());
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
    if (!(obj instanceof com.google.ads.googleads.v4.common.HotelLengthOfStayInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.HotelLengthOfStayInfo other = (com.google.ads.googleads.v4.common.HotelLengthOfStayInfo) obj;

    if (hasMinNights() != other.hasMinNights()) return false;
    if (hasMinNights()) {
      if (!getMinNights()
          .equals(other.getMinNights())) return false;
    }
    if (hasMaxNights() != other.hasMaxNights()) return false;
    if (hasMaxNights()) {
      if (!getMaxNights()
          .equals(other.getMaxNights())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMinNights()) {
      hash = (37 * hash) + MIN_NIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getMinNights().hashCode();
    }
    if (hasMaxNights()) {
      hash = (37 * hash) + MAX_NIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxNights().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.HotelLengthOfStayInfo prototype) {
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
   * <pre>
   * Criterion for length of hotel stay in nights.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.HotelLengthOfStayInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.HotelLengthOfStayInfo)
      com.google.ads.googleads.v4.common.HotelLengthOfStayInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelLengthOfStayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelLengthOfStayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.class, com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (minNightsBuilder_ == null) {
        minNights_ = null;
      } else {
        minNights_ = null;
        minNightsBuilder_ = null;
      }
      if (maxNightsBuilder_ == null) {
        maxNights_ = null;
      } else {
        maxNights_ = null;
        maxNightsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.CriteriaProto.internal_static_google_ads_googleads_v4_common_HotelLengthOfStayInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.HotelLengthOfStayInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.HotelLengthOfStayInfo build() {
      com.google.ads.googleads.v4.common.HotelLengthOfStayInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.HotelLengthOfStayInfo buildPartial() {
      com.google.ads.googleads.v4.common.HotelLengthOfStayInfo result = new com.google.ads.googleads.v4.common.HotelLengthOfStayInfo(this);
      if (minNightsBuilder_ == null) {
        result.minNights_ = minNights_;
      } else {
        result.minNights_ = minNightsBuilder_.build();
      }
      if (maxNightsBuilder_ == null) {
        result.maxNights_ = maxNights_;
      } else {
        result.maxNights_ = maxNightsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v4.common.HotelLengthOfStayInfo) {
        return mergeFrom((com.google.ads.googleads.v4.common.HotelLengthOfStayInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.HotelLengthOfStayInfo other) {
      if (other == com.google.ads.googleads.v4.common.HotelLengthOfStayInfo.getDefaultInstance()) return this;
      if (other.hasMinNights()) {
        mergeMinNights(other.getMinNights());
      }
      if (other.hasMaxNights()) {
        mergeMaxNights(other.getMaxNights());
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
      com.google.ads.googleads.v4.common.HotelLengthOfStayInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.HotelLengthOfStayInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value minNights_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> minNightsBuilder_;
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     * @return Whether the minNights field is set.
     */
    public boolean hasMinNights() {
      return minNightsBuilder_ != null || minNights_ != null;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     * @return The minNights.
     */
    public com.google.protobuf.Int64Value getMinNights() {
      if (minNightsBuilder_ == null) {
        return minNights_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : minNights_;
      } else {
        return minNightsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    public Builder setMinNights(com.google.protobuf.Int64Value value) {
      if (minNightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minNights_ = value;
        onChanged();
      } else {
        minNightsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    public Builder setMinNights(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (minNightsBuilder_ == null) {
        minNights_ = builderForValue.build();
        onChanged();
      } else {
        minNightsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    public Builder mergeMinNights(com.google.protobuf.Int64Value value) {
      if (minNightsBuilder_ == null) {
        if (minNights_ != null) {
          minNights_ =
            com.google.protobuf.Int64Value.newBuilder(minNights_).mergeFrom(value).buildPartial();
        } else {
          minNights_ = value;
        }
        onChanged();
      } else {
        minNightsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    public Builder clearMinNights() {
      if (minNightsBuilder_ == null) {
        minNights_ = null;
        onChanged();
      } else {
        minNights_ = null;
        minNightsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getMinNightsBuilder() {
      
      onChanged();
      return getMinNightsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getMinNightsOrBuilder() {
      if (minNightsBuilder_ != null) {
        return minNightsBuilder_.getMessageOrBuilder();
      } else {
        return minNights_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : minNights_;
      }
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value min_nights = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getMinNightsFieldBuilder() {
      if (minNightsBuilder_ == null) {
        minNightsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getMinNights(),
                getParentForChildren(),
                isClean());
        minNights_ = null;
      }
      return minNightsBuilder_;
    }

    private com.google.protobuf.Int64Value maxNights_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> maxNightsBuilder_;
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     * @return Whether the maxNights field is set.
     */
    public boolean hasMaxNights() {
      return maxNightsBuilder_ != null || maxNights_ != null;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     * @return The maxNights.
     */
    public com.google.protobuf.Int64Value getMaxNights() {
      if (maxNightsBuilder_ == null) {
        return maxNights_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : maxNights_;
      } else {
        return maxNightsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    public Builder setMaxNights(com.google.protobuf.Int64Value value) {
      if (maxNightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxNights_ = value;
        onChanged();
      } else {
        maxNightsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    public Builder setMaxNights(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (maxNightsBuilder_ == null) {
        maxNights_ = builderForValue.build();
        onChanged();
      } else {
        maxNightsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    public Builder mergeMaxNights(com.google.protobuf.Int64Value value) {
      if (maxNightsBuilder_ == null) {
        if (maxNights_ != null) {
          maxNights_ =
            com.google.protobuf.Int64Value.newBuilder(maxNights_).mergeFrom(value).buildPartial();
        } else {
          maxNights_ = value;
        }
        onChanged();
      } else {
        maxNightsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    public Builder clearMaxNights() {
      if (maxNightsBuilder_ == null) {
        maxNights_ = null;
        onChanged();
      } else {
        maxNights_ = null;
        maxNightsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getMaxNightsBuilder() {
      
      onChanged();
      return getMaxNightsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getMaxNightsOrBuilder() {
      if (maxNightsBuilder_ != null) {
        return maxNightsBuilder_.getMessageOrBuilder();
      } else {
        return maxNights_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : maxNights_;
      }
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value max_nights = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getMaxNightsFieldBuilder() {
      if (maxNightsBuilder_ == null) {
        maxNightsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getMaxNights(),
                getParentForChildren(),
                isClean());
        maxNights_ = null;
      }
      return maxNightsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.HotelLengthOfStayInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.HotelLengthOfStayInfo)
  private static final com.google.ads.googleads.v4.common.HotelLengthOfStayInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.HotelLengthOfStayInfo();
  }

  public static com.google.ads.googleads.v4.common.HotelLengthOfStayInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelLengthOfStayInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelLengthOfStayInfo>() {
    @java.lang.Override
    public HotelLengthOfStayInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelLengthOfStayInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelLengthOfStayInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelLengthOfStayInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.HotelLengthOfStayInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

