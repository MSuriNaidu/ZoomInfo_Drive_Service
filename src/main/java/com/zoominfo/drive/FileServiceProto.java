// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_service.proto

package com.zoominfo.drive;

public final class FileServiceProto {
  private FileServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_LoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_SignupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_SignupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_SignupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_SignupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_UploadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_UploadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_UploadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_UploadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_UploadFolderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_UploadFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_UploadFolderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_UploadFolderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_DownloadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_DownloadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_DownloadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_DownloadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_DeleteFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_DeleteFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_service_DeleteFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_file_service_DeleteFileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022file_service.proto\022\014file_service\"2\n\014Lo" +
      "ginRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010password" +
      "\030\002 \001(\t\"\036\n\rLoginResponse\022\r\n\005token\030\001 \001(\t\"3" +
      "\n\rSignupRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010pas" +
      "sword\030\002 \001(\t\"!\n\016SignupResponse\022\017\n\007message" +
      "\030\001 \001(\t\"B\n\021UploadFileRequest\022\r\n\005token\030\001 \001" +
      "(\t\022\020\n\010filename\030\002 \001(\t\022\014\n\004data\030\003 \001(\014\"%\n\022Up" +
      "loadFileResponse\022\017\n\007message\030\001 \001(\t\"h\n\023Upl" +
      "oadFolderRequest\022\r\n\005token\030\001 \001(\t\022\022\n\nfolde" +
      "rName\030\002 \001(\t\022.\n\005files\030\003 \003(\0132\037.file_servic" +
      "e.UploadFileRequest\"\'\n\024UploadFolderRespo" +
      "nse\022\017\n\007message\030\001 \001(\t\"6\n\023DownloadFileRequ" +
      "est\022\r\n\005token\030\001 \001(\t\022\020\n\010filename\030\002 \001(\t\"$\n\024" +
      "DownloadFileResponse\022\014\n\004data\030\001 \001(\014\"4\n\021De" +
      "leteFileRequest\022\r\n\005token\030\001 \001(\t\022\020\n\010filena" +
      "me\030\002 \001(\t\"%\n\022DeleteFileResponse\022\017\n\007messag" +
      "e\030\001 \001(\t2\344\003\n\013FileService\022@\n\005login\022\032.file_" +
      "service.LoginRequest\032\033.file_service.Logi" +
      "nResponse\022C\n\006signup\022\033.file_service.Signu" +
      "pRequest\032\034.file_service.SignupResponse\022O" +
      "\n\nuploadFile\022\037.file_service.UploadFileRe" +
      "quest\032 .file_service.UploadFileResponse\022" +
      "U\n\014uploadFolder\022!.file_service.UploadFol" +
      "derRequest\032\".file_service.UploadFolderRe" +
      "sponse\022U\n\014downloadFile\022!.file_service.Do" +
      "wnloadFileRequest\032\".file_service.Downloa" +
      "dFileResponse\022O\n\ndeleteFile\022\037.file_servi" +
      "ce.DeleteFileRequest\032 .file_service.Dele" +
      "teFileResponseB(\n\022com.zoominfo.driveB\020Fi" +
      "leServiceProtoP\001b\006proto3"
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
        }, assigner);
    internal_static_file_service_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_file_service_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_LoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_file_service_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_file_service_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_LoginResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_file_service_SignupRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_file_service_SignupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_SignupRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_file_service_SignupResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_file_service_SignupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_SignupResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_file_service_UploadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_file_service_UploadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_UploadFileRequest_descriptor,
        new java.lang.String[] { "Token", "Filename", "Data", });
    internal_static_file_service_UploadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_file_service_UploadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_UploadFileResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_file_service_UploadFolderRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_file_service_UploadFolderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_UploadFolderRequest_descriptor,
        new java.lang.String[] { "Token", "FolderName", "Files", });
    internal_static_file_service_UploadFolderResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_file_service_UploadFolderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_UploadFolderResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_file_service_DownloadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_file_service_DownloadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_DownloadFileRequest_descriptor,
        new java.lang.String[] { "Token", "Filename", });
    internal_static_file_service_DownloadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_file_service_DownloadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_DownloadFileResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_file_service_DeleteFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_file_service_DeleteFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_DeleteFileRequest_descriptor,
        new java.lang.String[] { "Token", "Filename", });
    internal_static_file_service_DeleteFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_file_service_DeleteFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_file_service_DeleteFileResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}