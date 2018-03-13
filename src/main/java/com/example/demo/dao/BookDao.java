package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 69077 on 2017/11/21.
 */
@Repository
public class BookDao {
    @Autowired
    private SqlSession sqlSession ;
    public List<Book> findBook(Book book){
        return sqlSession.selectList("findBook", book);
    }
}
