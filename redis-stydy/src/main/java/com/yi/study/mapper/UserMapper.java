package com.yi.study.mapper;

import com.yi.study.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author ysy
 * @Date 2023/2/15
 **/
@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    int updateUserAgeById(Integer id);
}
