package com.tedu.cn.demo.mapper;

import com.tedu.cn.demo.domain.User;

import java.util.List;

public interface user {
    /**
     * 用户相关信息操作
     * @return 用户信息列表
     * @throws Exception
     */
    User findUserById(int id) throws Exception;
    List<User> users() throws Exception;
}
