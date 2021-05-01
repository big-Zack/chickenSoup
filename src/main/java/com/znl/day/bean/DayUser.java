package com.znl.day.bean;

import java.io.Serializable;

/**
 * @author dell
 * @描述: 用户类
 * @文件名: User.java
 * @创建人: zyhNick
 * @创建时间: 14:01 2021/3/11
 * @修改人:
 * @修改备注: Copyright  2021/3/11
 */
public class DayUser implements Serializable {

    private String id;
    private String username;
    private String password;

    public DayUser() {
    }

    public DayUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        String o = "1";
        String p = "1";
        System.out.println(o == p);           // true

        Integer i11 = 1;
        Integer i22 = 1;
        System.out.println(i11 == i22);       // true

        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);         // false
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
