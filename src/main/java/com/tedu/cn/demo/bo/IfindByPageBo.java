package com.tedu.cn.demo.bo;

import com.tedu.cn.demo.domain.User;

import java.util.List;

public interface IfindByPageBo {
    /**
     * 用户相关信息操作
     * @return 用户信息列表
     * @throws Exception
     */
    User findUserById(int id) throws Exception;
    List<User> findByPage() throws Exception;
}
