package com.shun.mapper;

import com.shun.pojo.Blog;
import com.shun.utils.IdUtils;
import com.shun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogMapperTest {
    @Test
    public void testAddBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("java");
        blog.setAuthor("说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        blogMapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("python");
        blogMapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("c");
        blogMapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("c#");
        blogMapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void testQueryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("title", "java");

        List<Blog> list= blogMapper.queryBlogIf(map);

        for(Blog blog : list) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
