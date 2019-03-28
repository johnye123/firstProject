package com.tedu.cn.demo.bo;

import com.tedu.cn.demo.domain.User;
import com.tedu.cn.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindByPageBoImpl implements IfindByPageBo{
    @Autowired
    private UserMapper usermapper;
    @Override
    public User findUserById(int id) throws Exception {
        return usermapper.findUserById(id);
    }

    @Override
    public List<User> findByPage() throws Exception {
        return usermapper.findByPage();
    }
}
