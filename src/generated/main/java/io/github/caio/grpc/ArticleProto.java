// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: article.proto

package io.github.caio.grpc;

public final class ArticleProto {
  private ArticleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_article_ArticleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_article_ArticleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_article_ArticleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_article_ArticleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_article_ShowAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_article_ShowAllRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_article_ShowAllResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_article_ShowAllResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rarticle.proto\022\007article\"\036\n\016ArticleReque" +
      "st\022\014\n\004name\030\001 \001(\t\"\"\n\017ArticleResponse\022\017\n\007m" +
      "essage\030\001 \001(\t\"!\n\016ShowAllRequest\022\017\n\007messag" +
      "e\030\002 \001(\t\"\"\n\017ShowAllResponse\022\017\n\007message\030\002 " +
      "\001(\t2\204\001\n\007Article\022;\n\004post\022\027.article.Articl" +
      "eRequest\032\030.article.ArticleResponse\"\000\022<\n\003" +
      "get\022\027.article.ShowAllRequest\032\030.article.S" +
      "howAllResponse\"\0000\001B%\n\023io.github.caio.grp" +
      "cB\014ArticleProtoP\001b\006proto3"
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
    internal_static_article_ArticleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_article_ArticleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_article_ArticleRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_article_ArticleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_article_ArticleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_article_ArticleResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_article_ShowAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_article_ShowAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_article_ShowAllRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_article_ShowAllResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_article_ShowAllResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_article_ShowAllResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
