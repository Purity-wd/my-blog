package com.wyb.muchi.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wyb.muchi.blog.domain.Blog;
import com.wyb.muchi.blog.domain.query.BlogQuery;
import com.wyb.muchi.blog.support.PageList;

public interface BlogService {
    Page<Blog> page(BlogQuery blogQuery);

    Blog getById(Long id);

    void save(Blog temp);
}
