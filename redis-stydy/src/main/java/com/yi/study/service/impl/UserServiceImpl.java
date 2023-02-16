package com.yi.study.service.impl;

import com.yi.study.config.RedisConstant;
import com.yi.study.entity.User;
import com.yi.study.mapper.UserMapper;
import com.yi.study.service.UserService;
import com.yi.study.util.RedisUtil;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

/**
 * @Author ysy
 * @Date 2023/2/16
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public List<User> getAllUsers() {
        List<User> users=(List<User>)redisUtil
                .get(RedisConstant.ALL_USER_KEY);
        if(CollectionUtils.isEmpty(users)){
            users=userMapper.getAllUsers();
            redisUtil.set(RedisConstant.ALL_USER_KEY,users);
        }
        return users;
    }

    @Override
    @Transactional
    public void updateUserAge() {
        redisUtil.del(RedisConstant.ALL_USER_KEY);
        userMapper.updateUserAgeById(1);
        userMapper.updateUserAgeById(2);
    }
}
