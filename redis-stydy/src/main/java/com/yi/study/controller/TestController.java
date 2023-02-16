package com.yi.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ysy
 * @Date 2023/2/16
 **/
@RestController("/ysy")
public class TestController {
    @RequestMapping("/test")
    public Integer test(){
        return 666;
    }
}
