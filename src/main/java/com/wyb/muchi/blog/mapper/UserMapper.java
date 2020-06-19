package com.wyb.muchi.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyb.muchi.blog.domain.User;

public interface UserMapper extends BaseMapper<User> {
    User findById(long parseLong);
}
