// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/bidding_strategy.proto

package com.google.ads.googleads.v3.resources;

public interface BiddingStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.BiddingStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the bidding strategy.
   * Bidding strategy resource names have the form:
   * `customers/{customer_id}/biddingStrategies/{bidding_strategy_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the bidding strategy.
   * Bidding strategy resource names have the form:
   * `customers/{customer_id}/biddingStrategies/{bidding_strategy_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the bidding strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the bidding strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the bidding strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the bidding strategy.
   * All bidding strategies within an account must be named distinctly.
   * The length of this string should be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the bidding strategy.
   * All bidding strategies within an account must be named distinctly.
   * The length of this string should be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the bidding strategy.
   * All bidding strategies within an account must be named distinctly.
   * The length of this string should be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The status of the bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingStrategyStatusEnum.BiddingStrategyStatus status = 15;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingStrategyStatusEnum.BiddingStrategyStatus status = 15;</code>
   */
  com.google.ads.googleads.v3.enums.BiddingStrategyStatusEnum.BiddingStrategyStatus getStatus();

  /**
   * <pre>
   * The type of the bidding strategy.
   * Create a bidding strategy by setting the bidding scheme.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType type = 5;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the bidding strategy.
   * Create a bidding strategy by setting the bidding scheme.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType type = 5;</code>
   */
  com.google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType getType();

  /**
   * <pre>
   * The number of campaigns attached to this bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value campaign_count = 13;</code>
   */
  boolean hasCampaignCount();
  /**
   * <pre>
   * The number of campaigns attached to this bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value campaign_count = 13;</code>
   */
  com.google.protobuf.Int64Value getCampaignCount();
  /**
   * <pre>
   * The number of campaigns attached to this bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value campaign_count = 13;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCampaignCountOrBuilder();

  /**
   * <pre>
   * The number of non-removed campaigns attached to this bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value non_removed_campaign_count = 14;</code>
   */
  boolean hasNonRemovedCampaignCount();
  /**
   * <pre>
   * The number of non-removed campaigns attached to this bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value non_removed_campaign_count = 14;</code>
   */
  com.google.protobuf.Int64Value getNonRemovedCampaignCount();
  /**
   * <pre>
   * The number of non-removed campaigns attached to this bidding strategy.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value non_removed_campaign_count = 14;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getNonRemovedCampaignCountOrBuilder();

  /**
   * <pre>
   * A bidding strategy that raises bids for clicks that seem more likely to
   * lead to a conversion and lowers them for clicks where they seem less
   * likely.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.EnhancedCpc enhanced_cpc = 7;</code>
   */
  boolean hasEnhancedCpc();
  /**
   * <pre>
   * A bidding strategy that raises bids for clicks that seem more likely to
   * lead to a conversion and lowers them for clicks where they seem less
   * likely.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.EnhancedCpc enhanced_cpc = 7;</code>
   */
  com.google.ads.googleads.v3.common.EnhancedCpc getEnhancedCpc();
  /**
   * <pre>
   * A bidding strategy that raises bids for clicks that seem more likely to
   * lead to a conversion and lowers them for clicks where they seem less
   * likely.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.EnhancedCpc enhanced_cpc = 7;</code>
   */
  com.google.ads.googleads.v3.common.EnhancedCpcOrBuilder getEnhancedCpcOrBuilder();

  /**
   * <pre>
   * A bidding strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpa target_cpa = 9;</code>
   */
  boolean hasTargetCpa();
  /**
   * <pre>
   * A bidding strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpa target_cpa = 9;</code>
   */
  com.google.ads.googleads.v3.common.TargetCpa getTargetCpa();
  /**
   * <pre>
   * A bidding strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetCpa target_cpa = 9;</code>
   */
  com.google.ads.googleads.v3.common.TargetCpaOrBuilder getTargetCpaOrBuilder();

  /**
   * <pre>
   * A bidding strategy that automatically optimizes towards a desired
   * percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  boolean hasTargetImpressionShare();
  /**
   * <pre>
   * A bidding strategy that automatically optimizes towards a desired
   * percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  com.google.ads.googleads.v3.common.TargetImpressionShare getTargetImpressionShare();
  /**
   * <pre>
   * A bidding strategy that automatically optimizes towards a desired
   * percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  com.google.ads.googleads.v3.common.TargetImpressionShareOrBuilder getTargetImpressionShareOrBuilder();

  /**
   * <pre>
   * A bidding strategy that helps you maximize revenue while averaging a
   * specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetRoas target_roas = 11;</code>
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * A bidding strategy that helps you maximize revenue while averaging a
   * specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetRoas target_roas = 11;</code>
   */
  com.google.ads.googleads.v3.common.TargetRoas getTargetRoas();
  /**
   * <pre>
   * A bidding strategy that helps you maximize revenue while averaging a
   * specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetRoas target_roas = 11;</code>
   */
  com.google.ads.googleads.v3.common.TargetRoasOrBuilder getTargetRoasOrBuilder();

  /**
   * <pre>
   * A bid strategy that sets your bids to help get as many clicks as
   * possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetSpend target_spend = 12;</code>
   */
  boolean hasTargetSpend();
  /**
   * <pre>
   * A bid strategy that sets your bids to help get as many clicks as
   * possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetSpend target_spend = 12;</code>
   */
  com.google.ads.googleads.v3.common.TargetSpend getTargetSpend();
  /**
   * <pre>
   * A bid strategy that sets your bids to help get as many clicks as
   * possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TargetSpend target_spend = 12;</code>
   */
  com.google.ads.googleads.v3.common.TargetSpendOrBuilder getTargetSpendOrBuilder();

  public com.google.ads.googleads.v3.resources.BiddingStrategy.SchemeCase getSchemeCase();
}