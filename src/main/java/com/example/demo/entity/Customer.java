package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    public Customer(){}



    private int CustomerId ;       //用户编号 ，主键
    private String CustomerName ;//用户名
    private String CustomerPwd ; // 用户密码
    private String Customertruename ;//真实姓名
    private String CustomerSex ;//性别，取 男或女
    private String CustomerTel ; //用户电话
    private String CustomerEmail ;//E-mail
    private String CustomerAddr ;//住址
    private Date CustomerRegTime ; // 注册时间
    private String CustomerQues ; //提示问题
    private String CustomerAnsw ; //问题答案
    private int CustomerLogTime ; //登录次数
    private Date CustomerLastLogT ; // 上次登录时间

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerPwd() {
        return CustomerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        CustomerPwd = customerPwd;
    }

    public String getCustomertruename() {
        return Customertruename;
    }

    public void setCustomertruename(String customertruename) {
        Customertruename = customertruename;
    }

    public String getCustomerSex() {
        return CustomerSex;
    }

    public void setCustomerSex(String customerSex) {
        CustomerSex = customerSex;
    }

    public String getCustomerTel() {
        return CustomerTel;
    }

    public void setCustomerTel(String customerTel) {
        CustomerTel = customerTel;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerAddr() {
        return CustomerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        CustomerAddr = customerAddr;
    }

    public Date getCustomerRegTime() {
        return CustomerRegTime;
    }

    public void setCustomerRegTime(Date customerRegTime) {
        CustomerRegTime = customerRegTime;
    }

    public String getCustomerQues() {
        return CustomerQues;
    }

    public void setCustomerQues(String customerQues) {
        CustomerQues = customerQues;
    }

    public String getCustomerAnsw() {
        return CustomerAnsw;
    }

    public void setCustomerAnsw(String customerAnsw) {
        CustomerAnsw = customerAnsw;
    }

    public int getCustomerLogTime() {
        return CustomerLogTime;
    }

    public void setCustomerLogTime(int customerLogTime) {
        CustomerLogTime = customerLogTime;
    }

    public Date getCustomerLastLogT() {
        return CustomerLastLogT;
    }

    public void setCustomerLastLogT(Date customerLastLogT) {
        CustomerLastLogT = customerLastLogT;
    }
}
