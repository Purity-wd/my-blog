package com.wyb.muchi.blog.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wyb.muchi.blog.domain.Blog;
import com.wyb.muchi.blog.domain.common.Result;
import com.wyb.muchi.blog.domain.query.BlogQuery;
import com.wyb.muchi.blog.service.BlogService;
import com.wyb.muchi.blog.shiro.ShiroUtil;
import com.wyb.muchi.blog.support.PageList;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@RequestMapping("api/blog/auth")
public class BlogController {
    @Autowired
    BlogService blogService;
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @RequestMapping(value = "page", method = RequestMethod.POST)
    public Result blogs(@RequestBody BlogQuery blogQuery) {
        Page<Blog> result=blogService.page(blogQuery);
        return Result.success(new PageList<>(result));
    }
    @ApiOperation(value = "博客详情", notes = "博客详情")
    @RequestMapping(value = "findOne", method = RequestMethod.POST)
    public Result detail(@RequestParam("id") Long id){
        Blog blog = blogService.getById(id);
        Assert.notNull(blog, "该博客已删除！");
        return Result.success(blog);
    }




    @RequiresAuthentication
    @ApiOperation(value = "博客编辑", notes = "博客详情")
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public Result edit(@Validated @RequestBody Blog blog) {
        System.out.println(blog.toString());
        Blog temp = null;
        if(blog.getId() != null) {
            temp = blogService.getById(blog.getId());
            Assert.isTrue(temp.getUserId() == ShiroUtil.getProfile().getId(), "没有权限编辑");
        } else {
            temp = new Blog();
            temp.setUserId(ShiroUtil.getProfile().getId());
            temp.setStatus(0);
        }
        BeanUtil.copyProperties(blog, temp, "id", "userId", "status");
        blogService.save(temp);
        return Result.success("操作成功", null);
    }
}

