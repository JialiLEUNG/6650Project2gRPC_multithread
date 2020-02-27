package keyValueStore;

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
 * 3. define KeyValStore service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: keyValueStore.proto")
public final class KeyValStoreGrpc {

  private KeyValStoreGrpc() {}

  public static final String SERVICE_NAME = "KeyValStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.PutRequest,
      keyValueStore.KeyValueStore.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = keyValueStore.KeyValueStore.PutRequest.class,
      responseType = keyValueStore.KeyValueStore.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.PutRequest,
      keyValueStore.KeyValueStore.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.PutRequest, keyValueStore.KeyValueStore.PutResponse> getPutMethod;
    if ((getPutMethod = KeyValStoreGrpc.getPutMethod) == null) {
      synchronized (KeyValStoreGrpc.class) {
        if ((getPutMethod = KeyValStoreGrpc.getPutMethod) == null) {
          KeyValStoreGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<keyValueStore.KeyValueStore.PutRequest, keyValueStore.KeyValueStore.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KeyValStore", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  keyValueStore.KeyValueStore.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  keyValueStore.KeyValueStore.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyValStoreMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.GetRequest,
      keyValueStore.KeyValueStore.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = keyValueStore.KeyValueStore.GetRequest.class,
      responseType = keyValueStore.KeyValueStore.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.GetRequest,
      keyValueStore.KeyValueStore.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.GetRequest, keyValueStore.KeyValueStore.GetResponse> getGetMethod;
    if ((getGetMethod = KeyValStoreGrpc.getGetMethod) == null) {
      synchronized (KeyValStoreGrpc.class) {
        if ((getGetMethod = KeyValStoreGrpc.getGetMethod) == null) {
          KeyValStoreGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<keyValueStore.KeyValueStore.GetRequest, keyValueStore.KeyValueStore.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KeyValStore", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  keyValueStore.KeyValueStore.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  keyValueStore.KeyValueStore.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyValStoreMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.DeleteRequest,
      keyValueStore.KeyValueStore.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = keyValueStore.KeyValueStore.DeleteRequest.class,
      responseType = keyValueStore.KeyValueStore.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.DeleteRequest,
      keyValueStore.KeyValueStore.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<keyValueStore.KeyValueStore.DeleteRequest, keyValueStore.KeyValueStore.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = KeyValStoreGrpc.getDeleteMethod) == null) {
      synchronized (KeyValStoreGrpc.class) {
        if ((getDeleteMethod = KeyValStoreGrpc.getDeleteMethod) == null) {
          KeyValStoreGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<keyValueStore.KeyValueStore.DeleteRequest, keyValueStore.KeyValueStore.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KeyValStore", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  keyValueStore.KeyValueStore.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  keyValueStore.KeyValueStore.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyValStoreMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyValStoreStub newStub(io.grpc.Channel channel) {
    return new KeyValStoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyValStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeyValStoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyValStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeyValStoreFutureStub(channel);
  }

  /**
   * <pre>
   * 3. define KeyValStore service
   * </pre>
   */
  public static abstract class KeyValStoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * send a KeyValStore request
     * </pre>
     */
    public void put(keyValueStore.KeyValueStore.PutRequest request,
        io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(keyValueStore.KeyValueStore.GetRequest request,
        io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void delete(keyValueStore.KeyValueStore.DeleteRequest request,
        io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                keyValueStore.KeyValueStore.PutRequest,
                keyValueStore.KeyValueStore.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                keyValueStore.KeyValueStore.GetRequest,
                keyValueStore.KeyValueStore.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                keyValueStore.KeyValueStore.DeleteRequest,
                keyValueStore.KeyValueStore.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * 3. define KeyValStore service
   * </pre>
   */
  public static final class KeyValStoreStub extends io.grpc.stub.AbstractStub<KeyValStoreStub> {
    private KeyValStoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValStoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValStoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValStoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * send a KeyValStore request
     * </pre>
     */
    public void put(keyValueStore.KeyValueStore.PutRequest request,
        io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(keyValueStore.KeyValueStore.GetRequest request,
        io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(keyValueStore.KeyValueStore.DeleteRequest request,
        io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 3. define KeyValStore service
   * </pre>
   */
  public static final class KeyValStoreBlockingStub extends io.grpc.stub.AbstractStub<KeyValStoreBlockingStub> {
    private KeyValStoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValStoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValStoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValStoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * send a KeyValStore request
     * </pre>
     */
    public keyValueStore.KeyValueStore.PutResponse put(keyValueStore.KeyValueStore.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public keyValueStore.KeyValueStore.GetResponse get(keyValueStore.KeyValueStore.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public keyValueStore.KeyValueStore.DeleteResponse delete(keyValueStore.KeyValueStore.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 3. define KeyValStore service
   * </pre>
   */
  public static final class KeyValStoreFutureStub extends io.grpc.stub.AbstractStub<KeyValStoreFutureStub> {
    private KeyValStoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValStoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValStoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValStoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * send a KeyValStore request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<keyValueStore.KeyValueStore.PutResponse> put(
        keyValueStore.KeyValueStore.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<keyValueStore.KeyValueStore.GetResponse> get(
        keyValueStore.KeyValueStore.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<keyValueStore.KeyValueStore.DeleteResponse> delete(
        keyValueStore.KeyValueStore.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyValStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyValStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((keyValueStore.KeyValueStore.PutRequest) request,
              (io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((keyValueStore.KeyValueStore.GetRequest) request,
              (io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.GetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((keyValueStore.KeyValueStore.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<keyValueStore.KeyValueStore.DeleteResponse>) responseObserver);
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

  private static abstract class KeyValStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyValStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return keyValueStore.KeyValueStore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyValStore");
    }
  }

  private static final class KeyValStoreFileDescriptorSupplier
      extends KeyValStoreBaseDescriptorSupplier {
    KeyValStoreFileDescriptorSupplier() {}
  }

  private static final class KeyValStoreMethodDescriptorSupplier
      extends KeyValStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyValStoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyValStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyValStoreFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
