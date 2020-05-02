package com.poc.grpc.service;

import com.poc.grpc.generate.HelloResponse;
import com.poc.grpc.generate.HelloServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * @author a0k02hz
 */
@GRpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(com.poc.grpc.generate.HelloRequest request,
                      io.grpc.stub.StreamObserver<com.poc.grpc.generate.HelloResponse> responseObserver) {
        String greeting = new StringBuilder()
                .append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
