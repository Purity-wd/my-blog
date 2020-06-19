package com.wyb.muchi.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wyb.muchi.blog.domain.Blog;
import com.wyb.muchi.blog.domain.query.BlogQuery;

import java.util.List;

public interface BlogMapper extends BaseMapper<Blog> {
    List<Blog> page(Page<Blog> page, BlogQuery query);
}
