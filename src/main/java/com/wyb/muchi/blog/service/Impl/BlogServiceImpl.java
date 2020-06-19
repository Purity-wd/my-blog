package com.wyb.muchi.blog.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wyb.muchi.blog.domain.Blog;
import com.wyb.muchi.blog.domain.query.BlogQuery;
import com.wyb.muchi.blog.mapper.BlogMapper;
import com.wyb.muchi.blog.service.BlogService;
import com.wyb.muchi.blog.util.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public Page<Blog> page(BlogQuery query) {
        Page<Blog> page = PageFactory.defaultPage(query);
        List<Blog> list = blogMapper.page(page, query);
        page.setRecords(list);
        return page;
    }

    @Override
    public Blog getById(Long id) {
        return blogMapper.selectById(id);
    }

    @Override
    public void save(Blog temp) {
        blogMapper.updateById(temp);
    }
}
