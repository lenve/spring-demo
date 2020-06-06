package org.javaboy.aop;

import org.javaboy.aop.service.MyCalculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
public class MainXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculator calculator = ctx.getBean(MyCalculator.class);
        calculator.add(6, 7);
        calculator.min(6, 7);
    }
}
