package org.javaboy.aop;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
public class Main {
    public static void main(String[] args) {
        MyCalculatorImpl myCalculator = new MyCalculatorImpl();
        MyCalculator calculator = (MyCalculator) CalculatorProxy.getInstance(myCalculator);
        int add = calculator.add(3, 4);
        System.out.println("add = " + add);
    }
}
