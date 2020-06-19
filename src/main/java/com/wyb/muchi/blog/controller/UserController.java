package com.wyb.muchi.blog.controller;

import com.wyb.muchi.blog.domain.User;
import com.wyb.muchi.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blog/user")
@Api(value = "用户管理", tags = "用户管理")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "添加用户", notes = "添加用户")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Integer add(@RequestBody User user) {
        return userService.add(user);
    }
}
