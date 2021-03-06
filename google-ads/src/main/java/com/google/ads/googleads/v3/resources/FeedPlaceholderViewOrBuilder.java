// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed_placeholder_view.proto

package com.google.ads.googleads.v3.resources;

public interface FeedPlaceholderViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.FeedPlaceholderView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the feed placeholder view.
   * Feed placeholder view resource names have the form:
   * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the feed placeholder view.
   * Feed placeholder view resource names have the form:
   * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The placeholder type of the feed placeholder view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPlaceholderTypeValue();
  /**
   * <pre>
   * Output only. The placeholder type of the feed placeholder view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderType();
}
