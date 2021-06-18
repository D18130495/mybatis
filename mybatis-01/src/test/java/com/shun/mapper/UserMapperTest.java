package com.shun.mapper;

import com.shun.pojo.User;
import com.shun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void findUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = userMapper.getUserList();

        for(User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void findUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(userMapper.getUserById(1));

        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.insertUser(new User(4, "马六", "321654987"));

        sqlSession.commit();
        sqlSession.close();
    }
}
