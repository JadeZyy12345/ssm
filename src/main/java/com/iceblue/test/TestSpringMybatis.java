package com.iceblue.test;

import com.iceblue.dao.UserMapper;
import com.iceblue.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;

public class TestSpringMybatis {
//    private ApplicationContext applicationContext;
//
//    @Before
//    public void setUp(){
//        applicationContext=new ClassPathXmlApplicationContext("applicationContext-*.xml");
//    }
    @Test
    public void addUser () throws Exception {
        User user = new User();
        user.setUsername("Elena");
        user.setEmail("1730114671@qq.com");
        user.setPassword("12356");

        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        userMapper.addUser(user);
        session.commit();
        session.close();
        in.close();
    }
}
