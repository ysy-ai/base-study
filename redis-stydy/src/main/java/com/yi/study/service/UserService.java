package com.yi.study.service;

import com.yi.study.entity.User;
import java.util.List;

/**
 * @Author ysy
 * @Date 2023/2/16
 **/
public interface UserService {
    List<User> getAllUsers();
    void updateUserAge();
}
