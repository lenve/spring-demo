package org.javaboy.ioc;

import org.javaboy.ioc.javaconfig.JavaConfig;
import org.javaboy.ioc.javaconfig.SayHello;
import org.javaboy.ioc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
//        SayHello sayHello = ctx.getBean("sh", SayHello.class);
//        System.out.println(sayHello.sayHello("javaboy"));
//        UserService userService = ctx.getBean("us",UserService.class);
//        List<String> allUsers = userService.getAllUsers();
//        System.out.println("allUsers = " + allUsers);
    }
}
