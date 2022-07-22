package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.hello}")
    private String testHello;
@RequestMapping("/hello")
    public String hello(){
    return "ok";
}
    @PostMapping("/h1")
    public String h(String name){
        return name+testHello;
    }
}
