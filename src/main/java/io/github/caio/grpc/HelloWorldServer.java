package io.github.caio.grpc;


import controller.DBcontroller;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.logging.Logger;

public class HelloWorldServer {

    private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());
    private static DBcontroller dBcontroller;
    private int port = 42421;
    private Server server;

    private void start() throws Exception {
        logger.info("Starting the grpc server");

        server = ServerBuilder.forPort(port)
                .addService(new ArticleImpl())
                .build()
                .start();

        logger.info("Server started. Listening on port " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** JVM is shutting down. Turning off grpc server as well ***");
            HelloWorldServer.this.stop();
            System.err.println("*** shutdown complete ***");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    public static void main(String[] args) throws Exception {
        logger.info("Server startup. Args = " + Arrays.toString(args));
        dBcontroller=new DBcontroller();
        final HelloWorldServer helloWorldServer = new HelloWorldServer();

        helloWorldServer.start();
        helloWorldServer.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private class ArticleImpl extends ArticleGrpc.ArticleImplBase {

        @Override
        public void post(ArticleRequest request, StreamObserver<ArticleResponse> responseObserver) {
            ArticleResponse response =  ArticleResponse.newBuilder().setMessage("Saved").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            dBcontroller.DBSave(request.getName());
        }

        @Override
        public void get(ShowAllRequest request, StreamObserver<ShowAllResponse> responseObserver) {
            dBcontroller.BDShow(responseObserver);
        }
    }
}
