package com.shun.mapper;

import com.shun.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacherById(@Param("id") int id);
}
