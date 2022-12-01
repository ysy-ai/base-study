package com.yi.study.controller;

import io.swagger.annotations.Api;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ysy
 * @Date 2022/11/30
 **/
@RestController
@Api(tags = "redis操作")
@RequestMapping("/redisDemo")
public class RedisDemo {

    // redis的五种数据结构：string、hash、set、list、zset

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/testOne")
    public String testOne() {
        // String操作
        redisTemplate.opsForValue().set("testAdd", "新增成功");
        // list操作
        redisTemplate.opsForList().leftPush("list","1");
        redisTemplate.opsForList().leftPush("list","2");
        redisTemplate.opsForList().leftPush("list","3");
        List<String> list1 = redisTemplate.opsForList().range("list", 0, -1);
        list1.forEach(a->{
            System.out.println(a);
        });
        return redisTemplate.opsForValue().get("testAdd");
    }
}
