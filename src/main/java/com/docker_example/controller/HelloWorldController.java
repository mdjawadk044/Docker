package com.docker_example.controller;

import com.docker.controller.Restcontroller;

@Restcontroller
public class HelloWorldController {

    public  String sayHello() {
        return "Hello World!";
    }
}

