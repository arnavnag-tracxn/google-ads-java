// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/user_list.proto

package com.google.ads.googleads.v3.resources;

public interface UserListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.UserList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the user list.
   * User list resource names have the form:
   * `customers/{customer_id}/userLists/{user_list_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the user list.
   * User list resource names have the form:
   * `customers/{customer_id}/userLists/{user_list_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Id of the user list.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. Id of the user list.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. Id of the user list.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. A flag that indicates if a user may edit a list. Depends on the list
   * ownership and list type. For example, external remarketing user lists are
   * not editable.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue read_only = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasReadOnly();
  /**
   * <pre>
   * Output only. A flag that indicates if a user may edit a list. Depends on the list
   * ownership and list type. For example, external remarketing user lists are
   * not editable.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue read_only = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValue getReadOnly();
  /**
   * <pre>
   * Output only. A flag that indicates if a user may edit a list. Depends on the list
   * ownership and list type. For example, external remarketing user lists are
   * not editable.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue read_only = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getReadOnlyOrBuilder();

  /**
   * <pre>
   * Name of this user list. Depending on its access_reason, the user list name
   * may not be unique (e.g. if access_reason=SHARED)
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Name of this user list. Depending on its access_reason, the user list name
   * may not be unique (e.g. if access_reason=SHARED)
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Name of this user list. Depending on its access_reason, the user list name
   * may not be unique (e.g. if access_reason=SHARED)
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Description of this user list.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 5;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description of this user list.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 5;</code>
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * Description of this user list.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Membership status of this user list. Indicates whether a user list is open
   * or active. Only open user lists can accumulate more users and can be
   * targeted to.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListMembershipStatusEnum.UserListMembershipStatus membership_status = 6;</code>
   */
  int getMembershipStatusValue();
  /**
   * <pre>
   * Membership status of this user list. Indicates whether a user list is open
   * or active. Only open user lists can accumulate more users and can be
   * targeted to.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListMembershipStatusEnum.UserListMembershipStatus membership_status = 6;</code>
   */
  com.google.ads.googleads.v3.enums.UserListMembershipStatusEnum.UserListMembershipStatus getMembershipStatus();

  /**
   * <pre>
   * An ID from external system. It is used by user list sellers to correlate
   * IDs on their systems.
   * </pre>
   *
   * <code>.google.protobuf.StringValue integration_code = 7;</code>
   */
  boolean hasIntegrationCode();
  /**
   * <pre>
   * An ID from external system. It is used by user list sellers to correlate
   * IDs on their systems.
   * </pre>
   *
   * <code>.google.protobuf.StringValue integration_code = 7;</code>
   */
  com.google.protobuf.StringValue getIntegrationCode();
  /**
   * <pre>
   * An ID from external system. It is used by user list sellers to correlate
   * IDs on their systems.
   * </pre>
   *
   * <code>.google.protobuf.StringValue integration_code = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getIntegrationCodeOrBuilder();

  /**
   * <pre>
   * Number of days a user's cookie stays on your list since its most recent
   * addition to the list. This field must be between 0 and 540 inclusive.
   * However, for CRM based userlists, this field can be set to 10000 which
   * means no expiration.
   * It'll be ignored for logical_user_list.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value membership_life_span = 8;</code>
   */
  boolean hasMembershipLifeSpan();
  /**
   * <pre>
   * Number of days a user's cookie stays on your list since its most recent
   * addition to the list. This field must be between 0 and 540 inclusive.
   * However, for CRM based userlists, this field can be set to 10000 which
   * means no expiration.
   * It'll be ignored for logical_user_list.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value membership_life_span = 8;</code>
   */
  com.google.protobuf.Int64Value getMembershipLifeSpan();
  /**
   * <pre>
   * Number of days a user's cookie stays on your list since its most recent
   * addition to the list. This field must be between 0 and 540 inclusive.
   * However, for CRM based userlists, this field can be set to 10000 which
   * means no expiration.
   * It'll be ignored for logical_user_list.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value membership_life_span = 8;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMembershipLifeSpanOrBuilder();

  /**
   * <pre>
   * Output only. Estimated number of users in this user list, on the Google Display Network.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value size_for_display = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasSizeForDisplay();
  /**
   * <pre>
   * Output only. Estimated number of users in this user list, on the Google Display Network.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value size_for_display = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getSizeForDisplay();
  /**
   * <pre>
   * Output only. Estimated number of users in this user list, on the Google Display Network.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value size_for_display = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSizeForDisplayOrBuilder();

  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, on the Google
   * Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_display = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSizeRangeForDisplayValue();
  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, on the Google
   * Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_display = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.UserListSizeRangeEnum.UserListSizeRange getSizeRangeForDisplay();

  /**
   * <pre>
   * Output only. Estimated number of users in this user list in the google.com domain.
   * These are the users available for targeting in Search campaigns.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value size_for_search = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasSizeForSearch();
  /**
   * <pre>
   * Output only. Estimated number of users in this user list in the google.com domain.
   * These are the users available for targeting in Search campaigns.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value size_for_search = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getSizeForSearch();
  /**
   * <pre>
   * Output only. Estimated number of users in this user list in the google.com domain.
   * These are the users available for targeting in Search campaigns.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value size_for_search = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSizeForSearchOrBuilder();

  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, for Search ads.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_search = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSizeRangeForSearchValue();
  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, for Search ads.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_search = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.UserListSizeRangeEnum.UserListSizeRange getSizeRangeForSearch();

  /**
   * <pre>
   * Output only. Type of this list.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListTypeEnum.UserListType type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. Type of this list.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListTypeEnum.UserListType type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.UserListTypeEnum.UserListType getType();

  /**
   * <pre>
   * Indicating the reason why this user list membership status is closed. It is
   * only populated on lists that were automatically closed due to inactivity,
   * and will be cleared once the list membership status becomes open.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListClosingReasonEnum.UserListClosingReason closing_reason = 14;</code>
   */
  int getClosingReasonValue();
  /**
   * <pre>
   * Indicating the reason why this user list membership status is closed. It is
   * only populated on lists that were automatically closed due to inactivity,
   * and will be cleared once the list membership status becomes open.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListClosingReasonEnum.UserListClosingReason closing_reason = 14;</code>
   */
  com.google.ads.googleads.v3.enums.UserListClosingReasonEnum.UserListClosingReason getClosingReason();

  /**
   * <pre>
   * Output only. Indicates the reason this account has been granted access to the list.
   * The reason can be SHARED, OWNED, LICENSED or SUBSCRIBED.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AccessReasonEnum.AccessReason access_reason = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAccessReasonValue();
  /**
   * <pre>
   * Output only. Indicates the reason this account has been granted access to the list.
   * The reason can be SHARED, OWNED, LICENSED or SUBSCRIBED.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AccessReasonEnum.AccessReason access_reason = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.AccessReasonEnum.AccessReason getAccessReason();

  /**
   * <pre>
   * Indicates if this share is still enabled. When a UserList is shared with
   * the user this field is set to ENABLED. Later the userList owner can decide
   * to revoke the share and make it DISABLED.
   * The default value of this field is set to ENABLED.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListAccessStatusEnum.UserListAccessStatus account_user_list_status = 16;</code>
   */
  int getAccountUserListStatusValue();
  /**
   * <pre>
   * Indicates if this share is still enabled. When a UserList is shared with
   * the user this field is set to ENABLED. Later the userList owner can decide
   * to revoke the share and make it DISABLED.
   * The default value of this field is set to ENABLED.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.UserListAccessStatusEnum.UserListAccessStatus account_user_list_status = 16;</code>
   */
  com.google.ads.googleads.v3.enums.UserListAccessStatusEnum.UserListAccessStatus getAccountUserListStatus();

  /**
   * <pre>
   * Indicates if this user list is eligible for Google Search Network.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue eligible_for_search = 17;</code>
   */
  boolean hasEligibleForSearch();
  /**
   * <pre>
   * Indicates if this user list is eligible for Google Search Network.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue eligible_for_search = 17;</code>
   */
  com.google.protobuf.BoolValue getEligibleForSearch();
  /**
   * <pre>
   * Indicates if this user list is eligible for Google Search Network.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue eligible_for_search = 17;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEligibleForSearchOrBuilder();

  /**
   * <pre>
   * Output only. Indicates this user list is eligible for Google Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue eligible_for_display = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasEligibleForDisplay();
  /**
   * <pre>
   * Output only. Indicates this user list is eligible for Google Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue eligible_for_display = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValue getEligibleForDisplay();
  /**
   * <pre>
   * Output only. Indicates this user list is eligible for Google Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue eligible_for_display = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEligibleForDisplayOrBuilder();

  /**
   * <pre>
   * User list of CRM users provided by the advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CrmBasedUserListInfo crm_based_user_list = 19;</code>
   */
  boolean hasCrmBasedUserList();
  /**
   * <pre>
   * User list of CRM users provided by the advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CrmBasedUserListInfo crm_based_user_list = 19;</code>
   */
  com.google.ads.googleads.v3.common.CrmBasedUserListInfo getCrmBasedUserList();
  /**
   * <pre>
   * User list of CRM users provided by the advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.CrmBasedUserListInfo crm_based_user_list = 19;</code>
   */
  com.google.ads.googleads.v3.common.CrmBasedUserListInfoOrBuilder getCrmBasedUserListOrBuilder();

  /**
   * <pre>
   * Output only. User list which are similar to users from another UserList.
   * These lists are readonly and automatically created by google.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.SimilarUserListInfo similar_user_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasSimilarUserList();
  /**
   * <pre>
   * Output only. User list which are similar to users from another UserList.
   * These lists are readonly and automatically created by google.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.SimilarUserListInfo similar_user_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.SimilarUserListInfo getSimilarUserList();
  /**
   * <pre>
   * Output only. User list which are similar to users from another UserList.
   * These lists are readonly and automatically created by google.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.SimilarUserListInfo similar_user_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.common.SimilarUserListInfoOrBuilder getSimilarUserListOrBuilder();

  /**
   * <pre>
   * User list generated by a rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.RuleBasedUserListInfo rule_based_user_list = 21;</code>
   */
  boolean hasRuleBasedUserList();
  /**
   * <pre>
   * User list generated by a rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.RuleBasedUserListInfo rule_based_user_list = 21;</code>
   */
  com.google.ads.googleads.v3.common.RuleBasedUserListInfo getRuleBasedUserList();
  /**
   * <pre>
   * User list generated by a rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.RuleBasedUserListInfo rule_based_user_list = 21;</code>
   */
  com.google.ads.googleads.v3.common.RuleBasedUserListInfoOrBuilder getRuleBasedUserListOrBuilder();

  /**
   * <pre>
   * User list that is a custom combination of user lists and user interests.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LogicalUserListInfo logical_user_list = 22;</code>
   */
  boolean hasLogicalUserList();
  /**
   * <pre>
   * User list that is a custom combination of user lists and user interests.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LogicalUserListInfo logical_user_list = 22;</code>
   */
  com.google.ads.googleads.v3.common.LogicalUserListInfo getLogicalUserList();
  /**
   * <pre>
   * User list that is a custom combination of user lists and user interests.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.LogicalUserListInfo logical_user_list = 22;</code>
   */
  com.google.ads.googleads.v3.common.LogicalUserListInfoOrBuilder getLogicalUserListOrBuilder();

  /**
   * <pre>
   * User list targeting as a collection of conversion or remarketing actions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.BasicUserListInfo basic_user_list = 23;</code>
   */
  boolean hasBasicUserList();
  /**
   * <pre>
   * User list targeting as a collection of conversion or remarketing actions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.BasicUserListInfo basic_user_list = 23;</code>
   */
  com.google.ads.googleads.v3.common.BasicUserListInfo getBasicUserList();
  /**
   * <pre>
   * User list targeting as a collection of conversion or remarketing actions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.BasicUserListInfo basic_user_list = 23;</code>
   */
  com.google.ads.googleads.v3.common.BasicUserListInfoOrBuilder getBasicUserListOrBuilder();

  public com.google.ads.googleads.v3.resources.UserList.UserListCase getUserListCase();
}
