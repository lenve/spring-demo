package org.javaboy.ioc;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
public class WindowsShowCmd implements ShowCmd {
    public String showCmd() {
        return "dir";
    }
}
