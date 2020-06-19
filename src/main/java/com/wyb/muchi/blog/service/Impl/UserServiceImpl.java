package com.wyb.muchi.blog.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyb.muchi.blog.domain.User;
import com.wyb.muchi.blog.mapper.UserMapper;
import com.wyb.muchi.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService  {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getById(long parseLong) {
        return userMapper.findById(parseLong);
    }
}
