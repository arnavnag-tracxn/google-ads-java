// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer.proto

package com.google.ads.googleads.v3.resources;

public interface CustomerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  com.google.protobuf.StringValue getDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptiveNameOrBuilder();

  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValue getTimeZone();
  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  com.google.protobuf.StringValue getFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL
   * </pre>
   *
   * <code>.google.protobuf.StringValue final_url_suffix = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlSuffixOrBuilder();

  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  boolean hasAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  com.google.protobuf.BoolValue getAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_tagging_enabled = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAutoTaggingEnabledOrBuilder();

  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasHasPartnersBadge();
  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValue getHasPartnersBadge();
  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the Customer is not
   * associated with the Partners program, this will be false. For more
   * information, see https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_partners_badge = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasPartnersBadgeOrBuilder();

  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasManager();
  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValue getManager();
  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getManagerOrBuilder();

  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasTestAccount();
  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValue getTestAccount();
  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getTestAccountOrBuilder();

  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  boolean hasCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  com.google.ads.googleads.v3.resources.CallReportingSetting getCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  com.google.ads.googleads.v3.resources.CallReportingSettingOrBuilder getCallReportingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasConversionTrackingSetting();
  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.ConversionTrackingSetting getConversionTrackingSetting();
  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.ConversionTrackingSettingOrBuilder getConversionTrackingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasRemarketingSetting();
  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.RemarketingSetting getRemarketingSetting();
  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.RemarketingSettingOrBuilder getRemarketingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason> getPayPerConversionEligibilityFailureReasonsList();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPayPerConversionEligibilityFailureReasonsCount();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason getPayPerConversionEligibilityFailureReasons(int index);
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<java.lang.Integer>
  getPayPerConversionEligibilityFailureReasonsValueList();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
   * the list is empty, the customer is eligible. This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPayPerConversionEligibilityFailureReasonsValue(int index);
}
