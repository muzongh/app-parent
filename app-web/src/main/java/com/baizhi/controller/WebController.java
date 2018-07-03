package com.baizhi.controller;

import com.baizhi.service.HelloService;

public class WebController {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        System.out.println(helloService.hello("zs"));
    }
}
