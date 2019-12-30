package com.example.alibabanacosproviderserver.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liq
 * @date 2019/12/30
 */
@RestController
@EnableDiscoveryClient
public class BaseController {


    @GetMapping("/echo/{name}")
    public String echo(@PathVariable String name) {
        return "hello " + name;
    }

}
