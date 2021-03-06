// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/asset_service.proto

package com.google.ads.googleads.v2.services;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetAssetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetAssetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_AssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_AssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v2/services/asset" +
      "_service.proto\022 google.ads.googleads.v2." +
      "services\032-google/ads/googleads/v2/resour" +
      "ces/asset.proto\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\"(\n\017GetAss" +
      "etRequest\022\025\n\rresource_name\030\001 \001(\t\"p\n\023Muta" +
      "teAssetsRequest\022\023\n\013customer_id\030\001 \001(\t\022D\n\n" +
      "operations\030\002 \003(\01320.google.ads.googleads." +
      "v2.services.AssetOperation\"Y\n\016AssetOpera" +
      "tion\022:\n\006create\030\001 \001(\0132(.google.ads.google" +
      "ads.v2.resources.AssetH\000B\013\n\toperation\"\\\n" +
      "\024MutateAssetsResponse\022D\n\007results\030\002 \003(\01323" +
      ".google.ads.googleads.v2.services.Mutate" +
      "AssetResult\"*\n\021MutateAssetResult\022\025\n\rreso" +
      "urce_name\030\001 \001(\t2\377\002\n\014AssetService\022\231\001\n\010Get" +
      "Asset\0221.google.ads.googleads.v2.services" +
      ".GetAssetRequest\032(.google.ads.googleads." +
      "v2.resources.Asset\"0\202\323\344\223\002*\022(/v2/{resourc" +
      "e_name=customers/*/assets/*}\022\265\001\n\014MutateA" +
      "ssets\0225.google.ads.googleads.v2.services" +
      ".MutateAssetsRequest\0326.google.ads.google" +
      "ads.v2.services.MutateAssetsResponse\"6\202\323" +
      "\344\223\0020\"+/v2/customers/{customer_id=*}/asse" +
      "ts:mutate:\001*\032\033\312A\030googleads.googleapis.co" +
      "mB\370\001\n$com.google.ads.googleads.v2.servic" +
      "esB\021AssetServiceProtoP\001ZHgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v2/" +
      "services;services\242\002\003GAA\252\002 Google.Ads.Goo" +
      "gleAds.V2.Services\312\002 Google\\Ads\\GoogleAd" +
      "s\\V2\\Services\352\002$Google::Ads::GoogleAds::" +
      "V2::Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.AssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetAssetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetAssetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetAssetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v2_services_AssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_AssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_AssetOperation_descriptor,
        new java.lang.String[] { "Create", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateAssetsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v2_services_MutateAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.AssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
