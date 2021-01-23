package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author hetong.zhang
 * @version 1.0
 * @date 2021/1/22
 */
@Mapper
public interface UserMapper {
    void createUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUser(int id);
    List<User> getUserAll(String filter);
}