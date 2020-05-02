package com.poc.grpc.controller;

import com.poc.grpc.dto.DailyShippedOrders_v2;
import com.poc.grpc.dto.HelloResponse;
import com.poc.grpc.service.HelloServiceImpl;
import com.poc.grpc.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a0k02hz
 */
@RestController
public class HelloController {

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/hellowithrest")
    public HelloResponse helloWithRest(){
        return helloService.hello();
    }

    @PostMapping("/orderwithrest")
    public HelloResponse processOrderWithRest(DailyShippedOrders_v2 request){
        return orderService.processOrderWithRest(request);
    }
}
