package com.poc.grpc.controller;

import com.poc.grpc.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a0k02hz
 */
@RestController
public class HelloController {

    @GetMapping("/hellowithrest")
    public HelloResponse helloWithRest(){
        HelloResponse response = new HelloResponse();
        response.setGreeting("hello from rest");
        return  response;
    }
}
