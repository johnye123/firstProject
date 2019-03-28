package com.tedu.cn.demo.mapper;

import com.tedu.cn.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    /**
     * 用户相关信息操作
     * @return 用户信息列表
     * @throws Exception
     */
    User findUserById(int id) throws Exception;
    List<User> findByPage() throws Exception;
}
