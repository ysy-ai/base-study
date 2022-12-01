package com.yi.study.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ysy
 * @Date 2022/11/30
 **/
@RestController
@Api(tags = "swagger功能")
@RequestMapping("swagger")
public class SwaggerDemo {
    @GetMapping("/demoOne")
    public String demoOne(){
        return "hello world!";
    }
}
