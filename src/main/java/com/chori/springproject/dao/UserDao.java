package com.chori.springproject.dao;

import com.chori.springproject.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by chori on 2017. 7. 2..
 */
@Component
public class UserDao {
    @Autowired
    SqlSession sqlSession;

    public List<User> findAll() {
        return sqlSession.selectList("mapper.com.chori.springproject.userMapper.findAll");
    }
}
