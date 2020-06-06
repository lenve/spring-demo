package org.javaboy.ioc.service;

import org.javaboy.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
@Service("us")
public class UserService {
    @Autowired
    UserDao userDao;
    public List<String> getAllUsers() {
        String hello = userDao.hello();
        System.out.println("hello = " + hello);
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            users.add("javaboy:" + i);
        }
        return users;
    }
}
