package org.javaboy.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
@Service
public class AccountService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Transactional
    public void updateMoney() {
        jdbcTemplate.update("update account set money=money-500 where username=?", "zhangsan");
        int i = 1 / 0;
        jdbcTemplate.update("update account set money=money+500 where username=?", "lisi");
    }
}
