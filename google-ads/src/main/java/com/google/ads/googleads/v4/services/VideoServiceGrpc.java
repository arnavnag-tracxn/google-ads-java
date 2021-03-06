package com.google.ads.googleads.v4.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to manage videos.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/video_service.proto")
public final class VideoServiceGrpc {

  private VideoServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.VideoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVideoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetVideoRequest,
      com.google.ads.googleads.v4.resources.Video> METHOD_GET_VIDEO = getGetVideoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetVideoRequest,
      com.google.ads.googleads.v4.resources.Video> getGetVideoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetVideoRequest,
      com.google.ads.googleads.v4.resources.Video> getGetVideoMethod() {
    return getGetVideoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetVideoRequest,
      com.google.ads.googleads.v4.resources.Video> getGetVideoMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetVideoRequest, com.google.ads.googleads.v4.resources.Video> getGetVideoMethod;
    if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
          VideoServiceGrpc.getGetVideoMethod = getGetVideoMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetVideoRequest, com.google.ads.googleads.v4.resources.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.VideoService", "GetVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.Video.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("GetVideo"))
                  .build();
          }
        }
     }
     return getGetVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoServiceStub newStub(io.grpc.Channel channel) {
    return new VideoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VideoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VideoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static abstract class VideoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public void getVideo(com.google.ads.googleads.v4.services.GetVideoRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.Video> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVideoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVideoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetVideoRequest,
                com.google.ads.googleads.v4.resources.Video>(
                  this, METHODID_GET_VIDEO)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static final class VideoServiceStub extends io.grpc.stub.AbstractStub<VideoServiceStub> {
    private VideoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public void getVideo(com.google.ads.googleads.v4.services.GetVideoRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.Video> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVideoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static final class VideoServiceBlockingStub extends io.grpc.stub.AbstractStub<VideoServiceBlockingStub> {
    private VideoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.Video getVideo(com.google.ads.googleads.v4.services.GetVideoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVideoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage videos.
   * </pre>
   */
  public static final class VideoServiceFutureStub extends io.grpc.stub.AbstractStub<VideoServiceFutureStub> {
    private VideoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested video in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.Video> getVideo(
        com.google.ads.googleads.v4.services.GetVideoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVideoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VIDEO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VIDEO:
          serviceImpl.getVideo((com.google.ads.googleads.v4.services.GetVideoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.Video>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.VideoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoService");
    }
  }

  private static final class VideoServiceFileDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier {
    VideoServiceFileDescriptorSupplier() {}
  }

  private static final class VideoServiceMethodDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VideoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoServiceFileDescriptorSupplier())
              .addMethod(getGetVideoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
