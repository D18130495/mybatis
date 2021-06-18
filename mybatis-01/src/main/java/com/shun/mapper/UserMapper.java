package com.shun.mapper;

import com.shun.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int insertUser(User user);

    int insertUser2(Map<String, Object> map);

    int deleteUser(int id);
}
