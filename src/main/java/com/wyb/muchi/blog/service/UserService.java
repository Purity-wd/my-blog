package com.wyb.muchi.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyb.muchi.blog.domain.User;

public interface UserService extends IService<User> {
    Integer add(User user);

    User getById(long parseLong);
}
