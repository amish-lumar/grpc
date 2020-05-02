package com.poc.grpc.service;

import com.poc.grpc.generate.DailyShippedOrders_v2;
import com.poc.grpc.generate.HelloResponse;
import com.poc.grpc.generate.OrderServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * @author a0k02hz
 */
@GRpcService
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    @Override
    public void processOrder(com.poc.grpc.generate.DailyShippedOrders_v2 request,
                             io.grpc.stub.StreamObserver<com.poc.grpc.generate.HelloResponse> responseObserver) {
        String greeting = new StringBuilder()
                .append("Order processing, ")
                .toString();

        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public com.poc.grpc.dto.HelloResponse processOrderWithRest(com.poc.grpc.dto.DailyShippedOrders_v2 request){
        com.poc.grpc.dto.HelloResponse response = new com.poc.grpc.dto.HelloResponse();
        response.setGreeting("Order processing from rest");
        return  response;
    }

}
