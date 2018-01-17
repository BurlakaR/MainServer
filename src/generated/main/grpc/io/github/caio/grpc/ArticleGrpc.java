package io.github.caio.grpc;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: article.proto")
public final class ArticleGrpc {

  private ArticleGrpc() {}

  public static final String SERVICE_NAME = "article.Article";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPostMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.github.caio.grpc.ArticleRequest,
      io.github.caio.grpc.ArticleResponse> METHOD_POST = getPostMethod();

  private static volatile io.grpc.MethodDescriptor<io.github.caio.grpc.ArticleRequest,
      io.github.caio.grpc.ArticleResponse> getPostMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.github.caio.grpc.ArticleRequest,
      io.github.caio.grpc.ArticleResponse> getPostMethod() {
    io.grpc.MethodDescriptor<io.github.caio.grpc.ArticleRequest, io.github.caio.grpc.ArticleResponse> getPostMethod;
    if ((getPostMethod = ArticleGrpc.getPostMethod) == null) {
      synchronized (ArticleGrpc.class) {
        if ((getPostMethod = ArticleGrpc.getPostMethod) == null) {
          ArticleGrpc.getPostMethod = getPostMethod = 
              io.grpc.MethodDescriptor.<io.github.caio.grpc.ArticleRequest, io.github.caio.grpc.ArticleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "article.Article", "post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.caio.grpc.ArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.caio.grpc.ArticleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleMethodDescriptorSupplier("post"))
                  .build();
          }
        }
     }
     return getPostMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.github.caio.grpc.ShowAllRequest,
      io.github.caio.grpc.ShowAllResponse> METHOD_GET = getGetMethod();

  private static volatile io.grpc.MethodDescriptor<io.github.caio.grpc.ShowAllRequest,
      io.github.caio.grpc.ShowAllResponse> getGetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.github.caio.grpc.ShowAllRequest,
      io.github.caio.grpc.ShowAllResponse> getGetMethod() {
    io.grpc.MethodDescriptor<io.github.caio.grpc.ShowAllRequest, io.github.caio.grpc.ShowAllResponse> getGetMethod;
    if ((getGetMethod = ArticleGrpc.getGetMethod) == null) {
      synchronized (ArticleGrpc.class) {
        if ((getGetMethod = ArticleGrpc.getGetMethod) == null) {
          ArticleGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<io.github.caio.grpc.ShowAllRequest, io.github.caio.grpc.ShowAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "article.Article", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.caio.grpc.ShowAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.caio.grpc.ShowAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArticleMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArticleStub newStub(io.grpc.Channel channel) {
    return new ArticleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArticleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArticleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArticleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArticleFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ArticleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void post(io.github.caio.grpc.ArticleRequest request,
        io.grpc.stub.StreamObserver<io.github.caio.grpc.ArticleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }

    /**
     */
    public void get(io.github.caio.grpc.ShowAllRequest request,
        io.grpc.stub.StreamObserver<io.github.caio.grpc.ShowAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.github.caio.grpc.ArticleRequest,
                io.github.caio.grpc.ArticleResponse>(
                  this, METHODID_POST)))
          .addMethod(
            getGetMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.github.caio.grpc.ShowAllRequest,
                io.github.caio.grpc.ShowAllResponse>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ArticleStub extends io.grpc.stub.AbstractStub<ArticleStub> {
    private ArticleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void post(io.github.caio.grpc.ArticleRequest request,
        io.grpc.stub.StreamObserver<io.github.caio.grpc.ArticleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(io.github.caio.grpc.ShowAllRequest request,
        io.grpc.stub.StreamObserver<io.github.caio.grpc.ShowAllResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ArticleBlockingStub extends io.grpc.stub.AbstractStub<ArticleBlockingStub> {
    private ArticleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.github.caio.grpc.ArticleResponse post(io.github.caio.grpc.ArticleRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.github.caio.grpc.ShowAllResponse> get(
        io.github.caio.grpc.ShowAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ArticleFutureStub extends io.grpc.stub.AbstractStub<ArticleFutureStub> {
    private ArticleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.caio.grpc.ArticleResponse> post(
        io.github.caio.grpc.ArticleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST = 0;
  private static final int METHODID_GET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArticleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArticleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST:
          serviceImpl.post((io.github.caio.grpc.ArticleRequest) request,
              (io.grpc.stub.StreamObserver<io.github.caio.grpc.ArticleResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.github.caio.grpc.ShowAllRequest) request,
              (io.grpc.stub.StreamObserver<io.github.caio.grpc.ShowAllResponse>) responseObserver);
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

  private static abstract class ArticleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArticleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.caio.grpc.ArticleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Article");
    }
  }

  private static final class ArticleFileDescriptorSupplier
      extends ArticleBaseDescriptorSupplier {
    ArticleFileDescriptorSupplier() {}
  }

  private static final class ArticleMethodDescriptorSupplier
      extends ArticleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArticleMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArticleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArticleFileDescriptorSupplier())
              .addMethod(getPostMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
