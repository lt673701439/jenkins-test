package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于jenkins 部署测试
 * @author liutong
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String index(){
        System.out.println("index");
        return "welcome to jenkins test";
    }

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello world";
    }
}
