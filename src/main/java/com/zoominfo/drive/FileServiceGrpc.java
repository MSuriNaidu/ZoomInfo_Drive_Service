package com.zoominfo.drive;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: file_service.proto")
public final class FileServiceGrpc {

  private FileServiceGrpc() {}

  public static final String SERVICE_NAME = "file_service.FileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zoominfo.drive.LoginRequest,
      com.zoominfo.drive.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.zoominfo.drive.LoginRequest.class,
      responseType = com.zoominfo.drive.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zoominfo.drive.LoginRequest,
      com.zoominfo.drive.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.zoominfo.drive.LoginRequest, com.zoominfo.drive.LoginResponse> getLoginMethod;
    if ((getLoginMethod = FileServiceGrpc.getLoginMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getLoginMethod = FileServiceGrpc.getLoginMethod) == null) {
          FileServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.zoominfo.drive.LoginRequest, com.zoominfo.drive.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file_service.FileService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zoominfo.drive.SignupRequest,
      com.zoominfo.drive.SignupResponse> getSignupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signup",
      requestType = com.zoominfo.drive.SignupRequest.class,
      responseType = com.zoominfo.drive.SignupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zoominfo.drive.SignupRequest,
      com.zoominfo.drive.SignupResponse> getSignupMethod() {
    io.grpc.MethodDescriptor<com.zoominfo.drive.SignupRequest, com.zoominfo.drive.SignupResponse> getSignupMethod;
    if ((getSignupMethod = FileServiceGrpc.getSignupMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getSignupMethod = FileServiceGrpc.getSignupMethod) == null) {
          FileServiceGrpc.getSignupMethod = getSignupMethod = 
              io.grpc.MethodDescriptor.<com.zoominfo.drive.SignupRequest, com.zoominfo.drive.SignupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file_service.FileService", "signup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.SignupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.SignupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("signup"))
                  .build();
          }
        }
     }
     return getSignupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zoominfo.drive.UploadFileRequest,
      com.zoominfo.drive.UploadFileResponse> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadFile",
      requestType = com.zoominfo.drive.UploadFileRequest.class,
      responseType = com.zoominfo.drive.UploadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zoominfo.drive.UploadFileRequest,
      com.zoominfo.drive.UploadFileResponse> getUploadFileMethod() {
    io.grpc.MethodDescriptor<com.zoominfo.drive.UploadFileRequest, com.zoominfo.drive.UploadFileResponse> getUploadFileMethod;
    if ((getUploadFileMethod = FileServiceGrpc.getUploadFileMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getUploadFileMethod = FileServiceGrpc.getUploadFileMethod) == null) {
          FileServiceGrpc.getUploadFileMethod = getUploadFileMethod = 
              io.grpc.MethodDescriptor.<com.zoominfo.drive.UploadFileRequest, com.zoominfo.drive.UploadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file_service.FileService", "uploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.UploadFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("uploadFile"))
                  .build();
          }
        }
     }
     return getUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zoominfo.drive.UploadFolderRequest,
      com.zoominfo.drive.UploadFolderResponse> getUploadFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadFolder",
      requestType = com.zoominfo.drive.UploadFolderRequest.class,
      responseType = com.zoominfo.drive.UploadFolderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zoominfo.drive.UploadFolderRequest,
      com.zoominfo.drive.UploadFolderResponse> getUploadFolderMethod() {
    io.grpc.MethodDescriptor<com.zoominfo.drive.UploadFolderRequest, com.zoominfo.drive.UploadFolderResponse> getUploadFolderMethod;
    if ((getUploadFolderMethod = FileServiceGrpc.getUploadFolderMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getUploadFolderMethod = FileServiceGrpc.getUploadFolderMethod) == null) {
          FileServiceGrpc.getUploadFolderMethod = getUploadFolderMethod = 
              io.grpc.MethodDescriptor.<com.zoominfo.drive.UploadFolderRequest, com.zoominfo.drive.UploadFolderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file_service.FileService", "uploadFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.UploadFolderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.UploadFolderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("uploadFolder"))
                  .build();
          }
        }
     }
     return getUploadFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zoominfo.drive.DownloadFileRequest,
      com.zoominfo.drive.DownloadFileResponse> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "downloadFile",
      requestType = com.zoominfo.drive.DownloadFileRequest.class,
      responseType = com.zoominfo.drive.DownloadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zoominfo.drive.DownloadFileRequest,
      com.zoominfo.drive.DownloadFileResponse> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<com.zoominfo.drive.DownloadFileRequest, com.zoominfo.drive.DownloadFileResponse> getDownloadFileMethod;
    if ((getDownloadFileMethod = FileServiceGrpc.getDownloadFileMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getDownloadFileMethod = FileServiceGrpc.getDownloadFileMethod) == null) {
          FileServiceGrpc.getDownloadFileMethod = getDownloadFileMethod = 
              io.grpc.MethodDescriptor.<com.zoominfo.drive.DownloadFileRequest, com.zoominfo.drive.DownloadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file_service.FileService", "downloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.DownloadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.DownloadFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("downloadFile"))
                  .build();
          }
        }
     }
     return getDownloadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zoominfo.drive.DeleteFileRequest,
      com.zoominfo.drive.DeleteFileResponse> getDeleteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFile",
      requestType = com.zoominfo.drive.DeleteFileRequest.class,
      responseType = com.zoominfo.drive.DeleteFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zoominfo.drive.DeleteFileRequest,
      com.zoominfo.drive.DeleteFileResponse> getDeleteFileMethod() {
    io.grpc.MethodDescriptor<com.zoominfo.drive.DeleteFileRequest, com.zoominfo.drive.DeleteFileResponse> getDeleteFileMethod;
    if ((getDeleteFileMethod = FileServiceGrpc.getDeleteFileMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getDeleteFileMethod = FileServiceGrpc.getDeleteFileMethod) == null) {
          FileServiceGrpc.getDeleteFileMethod = getDeleteFileMethod = 
              io.grpc.MethodDescriptor.<com.zoominfo.drive.DeleteFileRequest, com.zoominfo.drive.DeleteFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file_service.FileService", "deleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.DeleteFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zoominfo.drive.DeleteFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("deleteFile"))
                  .build();
          }
        }
     }
     return getDeleteFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileServiceStub newStub(io.grpc.Channel channel) {
    return new FileServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.zoominfo.drive.LoginRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void signup(com.zoominfo.drive.SignupRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.SignupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignupMethod(), responseObserver);
    }

    /**
     */
    public void uploadFile(com.zoominfo.drive.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.UploadFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadFileMethod(), responseObserver);
    }

    /**
     */
    public void uploadFolder(com.zoominfo.drive.UploadFolderRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.UploadFolderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadFolderMethod(), responseObserver);
    }

    /**
     */
    public void downloadFile(com.zoominfo.drive.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.DownloadFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    /**
     */
    public void deleteFile(com.zoominfo.drive.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.DeleteFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zoominfo.drive.LoginRequest,
                com.zoominfo.drive.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getSignupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zoominfo.drive.SignupRequest,
                com.zoominfo.drive.SignupResponse>(
                  this, METHODID_SIGNUP)))
          .addMethod(
            getUploadFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zoominfo.drive.UploadFileRequest,
                com.zoominfo.drive.UploadFileResponse>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            getUploadFolderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zoominfo.drive.UploadFolderRequest,
                com.zoominfo.drive.UploadFolderResponse>(
                  this, METHODID_UPLOAD_FOLDER)))
          .addMethod(
            getDownloadFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zoominfo.drive.DownloadFileRequest,
                com.zoominfo.drive.DownloadFileResponse>(
                  this, METHODID_DOWNLOAD_FILE)))
          .addMethod(
            getDeleteFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zoominfo.drive.DeleteFileRequest,
                com.zoominfo.drive.DeleteFileResponse>(
                  this, METHODID_DELETE_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class FileServiceStub extends io.grpc.stub.AbstractStub<FileServiceStub> {
    private FileServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(com.zoominfo.drive.LoginRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signup(com.zoominfo.drive.SignupRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.SignupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadFile(com.zoominfo.drive.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.UploadFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadFolder(com.zoominfo.drive.UploadFolderRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.UploadFolderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadFile(com.zoominfo.drive.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.DownloadFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFile(com.zoominfo.drive.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<com.zoominfo.drive.DeleteFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileServiceBlockingStub extends io.grpc.stub.AbstractStub<FileServiceBlockingStub> {
    private FileServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zoominfo.drive.LoginResponse login(com.zoominfo.drive.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zoominfo.drive.SignupResponse signup(com.zoominfo.drive.SignupRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zoominfo.drive.UploadFileResponse uploadFile(com.zoominfo.drive.UploadFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zoominfo.drive.UploadFolderResponse uploadFolder(com.zoominfo.drive.UploadFolderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadFolderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zoominfo.drive.DownloadFileResponse downloadFile(com.zoominfo.drive.DownloadFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zoominfo.drive.DeleteFileResponse deleteFile(com.zoominfo.drive.DeleteFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileServiceFutureStub extends io.grpc.stub.AbstractStub<FileServiceFutureStub> {
    private FileServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zoominfo.drive.LoginResponse> login(
        com.zoominfo.drive.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zoominfo.drive.SignupResponse> signup(
        com.zoominfo.drive.SignupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zoominfo.drive.UploadFileResponse> uploadFile(
        com.zoominfo.drive.UploadFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zoominfo.drive.UploadFolderResponse> uploadFolder(
        com.zoominfo.drive.UploadFolderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadFolderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zoominfo.drive.DownloadFileResponse> downloadFile(
        com.zoominfo.drive.DownloadFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zoominfo.drive.DeleteFileResponse> deleteFile(
        com.zoominfo.drive.DeleteFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_SIGNUP = 1;
  private static final int METHODID_UPLOAD_FILE = 2;
  private static final int METHODID_UPLOAD_FOLDER = 3;
  private static final int METHODID_DOWNLOAD_FILE = 4;
  private static final int METHODID_DELETE_FILE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.zoominfo.drive.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.zoominfo.drive.LoginResponse>) responseObserver);
          break;
        case METHODID_SIGNUP:
          serviceImpl.signup((com.zoominfo.drive.SignupRequest) request,
              (io.grpc.stub.StreamObserver<com.zoominfo.drive.SignupResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_FILE:
          serviceImpl.uploadFile((com.zoominfo.drive.UploadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.zoominfo.drive.UploadFileResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_FOLDER:
          serviceImpl.uploadFolder((com.zoominfo.drive.UploadFolderRequest) request,
              (io.grpc.stub.StreamObserver<com.zoominfo.drive.UploadFolderResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((com.zoominfo.drive.DownloadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.zoominfo.drive.DownloadFileResponse>) responseObserver);
          break;
        case METHODID_DELETE_FILE:
          serviceImpl.deleteFile((com.zoominfo.drive.DeleteFileRequest) request,
              (io.grpc.stub.StreamObserver<com.zoominfo.drive.DeleteFileResponse>) responseObserver);
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

  private static abstract class FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zoominfo.drive.FileServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileService");
    }
  }

  private static final class FileServiceFileDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier {
    FileServiceFileDescriptorSupplier() {}
  }

  private static final class FileServiceMethodDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getSignupMethod())
              .addMethod(getUploadFileMethod())
              .addMethod(getUploadFolderMethod())
              .addMethod(getDownloadFileMethod())
              .addMethod(getDeleteFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
