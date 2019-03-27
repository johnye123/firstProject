package com.tedu.cn.demo.domain;

public class User {
    //注意这里的属性名要与数据库中字段相同，否则获取不到值，同样不区分大小写
    private int id;

    private String username;

    private String password;

    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
