package com.zoominfo.drive;

import io.grpc.stub.StreamObserver;

public class FileServiceImpl extends FileServiceGrpc.FileServiceImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        String userName = request.getUsername();
        String password = request.getPassword();
        LoginResponse.Builder response = LoginResponse.newBuilder();
        if ("admin".equals(userName) && "password".equals(password)) {
            System.out.println("successful");
            response.setToken("Success");
        } else {
            response.setToken("Failed");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void signup(SignupRequest request, StreamObserver<SignupResponse> responseObserver) {
        // Implement signup logic
    }

    @Override
    public void uploadFile(UploadFileRequest request, StreamObserver<UploadFileResponse> responseObserver) {
        // Implement file upload logic
    }

    @Override
    public void uploadFolder(UploadFolderRequest request, StreamObserver<UploadFolderResponse> responseObserver) {
        // Implement folder upload logic
    }

    @Override
    public void downloadFile(DownloadFileRequest request, StreamObserver<DownloadFileResponse> responseObserver) {
        // Implement file download logic
    }

    @Override
    public void deleteFile(DeleteFileRequest request, StreamObserver<DeleteFileResponse> responseObserver) {
        // Implement file delete logic
    }
}
