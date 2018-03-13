package com.example.demo.entity;

import java.io.Serializable;

public class Maneger implements Serializable {
    public Maneger(){}

    private int AdminId ; //管理员编号
    private String AdminName ;//管理员名
    private String AdminPwd ; //管理员密码
    private int AdminFlag ; //权限标志

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getAdminPwd() {
        return AdminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        AdminPwd = adminPwd;
    }

    public int getAdminFlag() {
        return AdminFlag;
    }

    public void setAdminFlag(int adminFlag) {
        AdminFlag = adminFlag;
    }
}
