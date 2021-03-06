// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/bidding.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * An automated bid strategy that sets your bids to help get as many clicks
 * as possible within your budget.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.TargetSpend}
 */
public  final class TargetSpend extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.TargetSpend)
    TargetSpendOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetSpend.newBuilder() to construct.
  private TargetSpend(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetSpend() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetSpend();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetSpend(
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
            if (targetSpendMicros_ != null) {
              subBuilder = targetSpendMicros_.toBuilder();
            }
            targetSpendMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(targetSpendMicros_);
              targetSpendMicros_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (cpcBidCeilingMicros_ != null) {
              subBuilder = cpcBidCeilingMicros_.toBuilder();
            }
            cpcBidCeilingMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cpcBidCeilingMicros_);
              cpcBidCeilingMicros_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.common.BiddingProto.internal_static_google_ads_googleads_v4_common_TargetSpend_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.BiddingProto.internal_static_google_ads_googleads_v4_common_TargetSpend_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.TargetSpend.class, com.google.ads.googleads.v4.common.TargetSpend.Builder.class);
  }

  public static final int TARGET_SPEND_MICROS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value targetSpendMicros_;
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
   * @return Whether the targetSpendMicros field is set.
   */
  public boolean hasTargetSpendMicros() {
    return targetSpendMicros_ != null;
  }
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
   * @return The targetSpendMicros.
   */
  public com.google.protobuf.Int64Value getTargetSpendMicros() {
    return targetSpendMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : targetSpendMicros_;
  }
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getTargetSpendMicrosOrBuilder() {
    return getTargetSpendMicros();
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value cpcBidCeilingMicros_;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  public boolean hasCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_ != null;
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   * @return The cpcBidCeilingMicros.
   */
  public com.google.protobuf.Int64Value getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder() {
    return getCpcBidCeilingMicros();
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
    if (targetSpendMicros_ != null) {
      output.writeMessage(1, getTargetSpendMicros());
    }
    if (cpcBidCeilingMicros_ != null) {
      output.writeMessage(2, getCpcBidCeilingMicros());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetSpendMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTargetSpendMicros());
    }
    if (cpcBidCeilingMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCpcBidCeilingMicros());
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
    if (!(obj instanceof com.google.ads.googleads.v4.common.TargetSpend)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.TargetSpend other = (com.google.ads.googleads.v4.common.TargetSpend) obj;

    if (hasTargetSpendMicros() != other.hasTargetSpendMicros()) return false;
    if (hasTargetSpendMicros()) {
      if (!getTargetSpendMicros()
          .equals(other.getTargetSpendMicros())) return false;
    }
    if (hasCpcBidCeilingMicros() != other.hasCpcBidCeilingMicros()) return false;
    if (hasCpcBidCeilingMicros()) {
      if (!getCpcBidCeilingMicros()
          .equals(other.getCpcBidCeilingMicros())) return false;
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
    if (hasTargetSpendMicros()) {
      hash = (37 * hash) + TARGET_SPEND_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetSpendMicros().hashCode();
    }
    if (hasCpcBidCeilingMicros()) {
      hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getCpcBidCeilingMicros().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.TargetSpend parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.TargetSpend prototype) {
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
   * An automated bid strategy that sets your bids to help get as many clicks
   * as possible within your budget.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.TargetSpend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.TargetSpend)
      com.google.ads.googleads.v4.common.TargetSpendOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.BiddingProto.internal_static_google_ads_googleads_v4_common_TargetSpend_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.BiddingProto.internal_static_google_ads_googleads_v4_common_TargetSpend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.TargetSpend.class, com.google.ads.googleads.v4.common.TargetSpend.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.TargetSpend.newBuilder()
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
      if (targetSpendMicrosBuilder_ == null) {
        targetSpendMicros_ = null;
      } else {
        targetSpendMicros_ = null;
        targetSpendMicrosBuilder_ = null;
      }
      if (cpcBidCeilingMicrosBuilder_ == null) {
        cpcBidCeilingMicros_ = null;
      } else {
        cpcBidCeilingMicros_ = null;
        cpcBidCeilingMicrosBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.BiddingProto.internal_static_google_ads_googleads_v4_common_TargetSpend_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.TargetSpend getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.TargetSpend.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.TargetSpend build() {
      com.google.ads.googleads.v4.common.TargetSpend result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.TargetSpend buildPartial() {
      com.google.ads.googleads.v4.common.TargetSpend result = new com.google.ads.googleads.v4.common.TargetSpend(this);
      if (targetSpendMicrosBuilder_ == null) {
        result.targetSpendMicros_ = targetSpendMicros_;
      } else {
        result.targetSpendMicros_ = targetSpendMicrosBuilder_.build();
      }
      if (cpcBidCeilingMicrosBuilder_ == null) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
      } else {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicrosBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.common.TargetSpend) {
        return mergeFrom((com.google.ads.googleads.v4.common.TargetSpend)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.TargetSpend other) {
      if (other == com.google.ads.googleads.v4.common.TargetSpend.getDefaultInstance()) return this;
      if (other.hasTargetSpendMicros()) {
        mergeTargetSpendMicros(other.getTargetSpendMicros());
      }
      if (other.hasCpcBidCeilingMicros()) {
        mergeCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
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
      com.google.ads.googleads.v4.common.TargetSpend parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.TargetSpend) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value targetSpendMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> targetSpendMicrosBuilder_;
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     * @return Whether the targetSpendMicros field is set.
     */
    public boolean hasTargetSpendMicros() {
      return targetSpendMicrosBuilder_ != null || targetSpendMicros_ != null;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     * @return The targetSpendMicros.
     */
    public com.google.protobuf.Int64Value getTargetSpendMicros() {
      if (targetSpendMicrosBuilder_ == null) {
        return targetSpendMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : targetSpendMicros_;
      } else {
        return targetSpendMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    public Builder setTargetSpendMicros(com.google.protobuf.Int64Value value) {
      if (targetSpendMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetSpendMicros_ = value;
        onChanged();
      } else {
        targetSpendMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    public Builder setTargetSpendMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (targetSpendMicrosBuilder_ == null) {
        targetSpendMicros_ = builderForValue.build();
        onChanged();
      } else {
        targetSpendMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    public Builder mergeTargetSpendMicros(com.google.protobuf.Int64Value value) {
      if (targetSpendMicrosBuilder_ == null) {
        if (targetSpendMicros_ != null) {
          targetSpendMicros_ =
            com.google.protobuf.Int64Value.newBuilder(targetSpendMicros_).mergeFrom(value).buildPartial();
        } else {
          targetSpendMicros_ = value;
        }
        onChanged();
      } else {
        targetSpendMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    public Builder clearTargetSpendMicros() {
      if (targetSpendMicrosBuilder_ == null) {
        targetSpendMicros_ = null;
        onChanged();
      } else {
        targetSpendMicros_ = null;
        targetSpendMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getTargetSpendMicrosBuilder() {
      
      onChanged();
      return getTargetSpendMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getTargetSpendMicrosOrBuilder() {
      if (targetSpendMicrosBuilder_ != null) {
        return targetSpendMicrosBuilder_.getMessageOrBuilder();
      } else {
        return targetSpendMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : targetSpendMicros_;
      }
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getTargetSpendMicrosFieldBuilder() {
      if (targetSpendMicrosBuilder_ == null) {
        targetSpendMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getTargetSpendMicros(),
                getParentForChildren(),
                isClean());
        targetSpendMicros_ = null;
      }
      return targetSpendMicrosBuilder_;
    }

    private com.google.protobuf.Int64Value cpcBidCeilingMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> cpcBidCeilingMicrosBuilder_;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     * @return Whether the cpcBidCeilingMicros field is set.
     */
    public boolean hasCpcBidCeilingMicros() {
      return cpcBidCeilingMicrosBuilder_ != null || cpcBidCeilingMicros_ != null;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     * @return The cpcBidCeilingMicros.
     */
    public com.google.protobuf.Int64Value getCpcBidCeilingMicros() {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        return cpcBidCeilingMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
      } else {
        return cpcBidCeilingMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    public Builder setCpcBidCeilingMicros(com.google.protobuf.Int64Value value) {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cpcBidCeilingMicros_ = value;
        onChanged();
      } else {
        cpcBidCeilingMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    public Builder setCpcBidCeilingMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        cpcBidCeilingMicros_ = builderForValue.build();
        onChanged();
      } else {
        cpcBidCeilingMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    public Builder mergeCpcBidCeilingMicros(com.google.protobuf.Int64Value value) {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        if (cpcBidCeilingMicros_ != null) {
          cpcBidCeilingMicros_ =
            com.google.protobuf.Int64Value.newBuilder(cpcBidCeilingMicros_).mergeFrom(value).buildPartial();
        } else {
          cpcBidCeilingMicros_ = value;
        }
        onChanged();
      } else {
        cpcBidCeilingMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    public Builder clearCpcBidCeilingMicros() {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        cpcBidCeilingMicros_ = null;
        onChanged();
      } else {
        cpcBidCeilingMicros_ = null;
        cpcBidCeilingMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCpcBidCeilingMicrosBuilder() {
      
      onChanged();
      return getCpcBidCeilingMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder() {
      if (cpcBidCeilingMicrosBuilder_ != null) {
        return cpcBidCeilingMicrosBuilder_.getMessageOrBuilder();
      } else {
        return cpcBidCeilingMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : cpcBidCeilingMicros_;
      }
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCpcBidCeilingMicrosFieldBuilder() {
      if (cpcBidCeilingMicrosBuilder_ == null) {
        cpcBidCeilingMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCpcBidCeilingMicros(),
                getParentForChildren(),
                isClean());
        cpcBidCeilingMicros_ = null;
      }
      return cpcBidCeilingMicrosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.TargetSpend)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.TargetSpend)
  private static final com.google.ads.googleads.v4.common.TargetSpend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.TargetSpend();
  }

  public static com.google.ads.googleads.v4.common.TargetSpend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetSpend>
      PARSER = new com.google.protobuf.AbstractParser<TargetSpend>() {
    @java.lang.Override
    public TargetSpend parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetSpend(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetSpend> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetSpend> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.TargetSpend getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

