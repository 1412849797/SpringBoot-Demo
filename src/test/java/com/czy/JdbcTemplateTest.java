package com.czy;

import com.czy.Bean.User;

import com.czy.Service.UserService;
import com.czy.Service.UserServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/1/20 15:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class JdbcTemplateTest {

    @Autowired
    private UserService userSerivce;

    @Before
    public void  setUp(){
        userSerivce.deleteAllUsers();
    }
    @Test
    public void test() throws Exception{
        userSerivce.create("Tom",10);

        userSerivce.create("Mike", 11);
        userSerivce.create("Didispace", 30);
        userSerivce.create("Oscar", 21);
        userSerivce.create("Linda", 17);

        // 查询名为Oscar的用户，判断年龄是否匹配
        List<User> userList = userSerivce.getByName("Oscar");
        Assert.assertEquals(21, userList.get(0).getAge());

        // 查数据库，应该有5个用户
        Assert.assertEquals(5, userSerivce.getAllUsers());

        // 删除两个用户
        userSerivce.deleteByName("Tom");
        userSerivce.deleteByName("Mike");

        // 查数据库，应该有5个用户
        Assert.assertEquals(3, userSerivce.getAllUsers());
    }

}
