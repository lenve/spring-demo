package org.javaboy.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 *
 * @Configuration  注解表示这是一个 Java 配置类，配置类的作用类似于 applicationContext.xml
 */
@Configuration
@ComponentScan(basePackages = "org.javaboy.ioc",useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class),@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Repository.class)})
public class JavaConfig {
    @Bean("sh")
    SayHello sayHello() {
        return new SayHello();
    }
}