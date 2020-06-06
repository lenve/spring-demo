package org.javaboy.aop.service;

import org.springframework.stereotype.Component;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
@Component
public class MyCalculatorImpl implements MyCalculator {
//    @Action
    public Integer add(int a, int b) {
//        int i = 1 / 0;
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }
//    @Action
    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
