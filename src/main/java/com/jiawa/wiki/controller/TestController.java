package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/hello")
    public String hello(){
    return "ok";
}
    @PostMapping("/h")
    public String h(String name){
        return name;
    }
}
