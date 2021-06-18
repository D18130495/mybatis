package com.shun.mapper;

import com.shun.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int insertUser(User user);
}
