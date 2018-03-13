package com.example.demo.entity;

import java.io.Serializable;

public class BookType implements Serializable {
    public BookType(){}

    private int BookTypeId ; //图书类型编号
    private String BookTypeName ; //类别名

    public int getBookTypeId() {
        return BookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        BookTypeId = bookTypeId;
    }

    public String getBookTypeName() {
        return BookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        BookTypeName = bookTypeName;
    }
}
