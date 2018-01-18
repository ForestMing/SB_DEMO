package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by 69077 on 2017/11/21.
 */
@Repository
public class PersonDao {
    @Autowired
    private SqlSession sqlSession ;
    public int insertPerson(Person person){
        return sqlSession.insert("addPerson",person);
    }
}
