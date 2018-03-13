package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
    public Book(){}

    private int BookId ; //图书编号 //主键
    private int BookTypeId ; //图书类型，booktype的外键
    private String BookName ; //书名
    private String BookPress ; // 出版社
    private Date BookPubDate ; // 出版如期
    private int BookSize ; //开本
    private String BookVersion ;//版次
    private String BookAuthor ; //图书作者
    private String BookTanslor; // 图书译者
    private String Bookisbn ; //图书isbn码
    private double BookPrprice ; //图书定价
    private int BookPage ;//图书页码
    private int BookDealmount ;//成交量
    private double BookDiscount ; //折扣
    private String BookPic ; //图书封面
    private int BookStoremount; //图书库存
    private Date BookStoretime ; //入库时间
    private String BookPackstyle ; //封装时间

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getBookTypeId() {
        return BookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        BookTypeId = bookTypeId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookPress() {
        return BookPress;
    }

    public void setBookPress(String bookPress) {
        BookPress = bookPress;
    }

    public Date getBookPubDate() {
        return BookPubDate;
    }

    public void setBookPubDate(Date bookPubDate) {
        BookPubDate = bookPubDate;
    }

    public int getBookSize() {
        return BookSize;
    }

    public void setBookSize(int bookSize) {
        BookSize = bookSize;
    }

    public String getBookVersion() {
        return BookVersion;
    }

    public void setBookVersion(String bookVersion) {
        BookVersion = bookVersion;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public String getBookTanslor() {
        return BookTanslor;
    }

    public void setBookTanslor(String bookTanslor) {
        BookTanslor = bookTanslor;
    }

    public String getBookisbn() {
        return Bookisbn;
    }

    public void setBookisbn(String bookisbn) {
        Bookisbn = bookisbn;
    }

    public double getBookPrprice() {
        return BookPrprice;
    }

    public void setBookPrprice(double bookPrprice) {
        BookPrprice = bookPrprice;
    }

    public int getBookPage() {
        return BookPage;
    }

    public void setBookPage(int bookPage) {
        BookPage = bookPage;
    }

    public int getBookDealmount() {
        return BookDealmount;
    }

    public void setBookDealmount(int bookDealmount) {
        BookDealmount = bookDealmount;
    }

    public double getBookDiscount() {
        return BookDiscount;
    }

    public void setBookDiscount(double bookDiscount) {
        BookDiscount = bookDiscount;
    }

    public String getBookPic() {
        return BookPic;
    }

    public void setBookPic(String bookPic) {
        BookPic = bookPic;
    }

    public int getBookStoremount() {
        return BookStoremount;
    }

    public void setBookStoremount(int bookStoremount) {
        BookStoremount = bookStoremount;
    }

    public Date getBookStoretime() {
        return BookStoretime;
    }

    public void setBookStoretime(Date bookStoretime) {
        BookStoretime = bookStoretime;
    }

    public String getBookPackstyle() {
        return BookPackstyle;
    }

    public void setBookPackstyle(String bookPackstyle) {
        BookPackstyle = bookPackstyle;
    }
}
