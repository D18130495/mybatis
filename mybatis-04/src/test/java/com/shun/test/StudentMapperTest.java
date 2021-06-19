package com.shun.test;

import com.shun.mapper.StudentMapper;
import com.shun.mapper.TeacherMapper;
import com.shun.pojo.Student;
import com.shun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void testGetStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> list = studentMapper.getStudent();

        for(Student student : list) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testGetStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> list = studentMapper.getStudent2();

        for(Student student : list) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void TestGetTeacherById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        System.out.println(teacherMapper.getTeacherById(1));

        sqlSession.close();
    }

}
