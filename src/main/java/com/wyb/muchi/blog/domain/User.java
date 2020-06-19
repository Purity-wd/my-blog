package com.wyb.muchi.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("user")
public class User extends Model<User> {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "用户主键")
    private Integer id;
    @ApiModelProperty(value = "用户名称")
    private String userName;
    @ApiModelProperty(value = "salt")
    private String salt;
    @ApiModelProperty(value = "电话号")
    private String phone;
    @ApiModelProperty(value = "创建时间")
    private String createTime;
    @ApiModelProperty(value = "更新时间")
    private String updateTime;
    @ApiModelProperty(value = "头像")
    private String headUrl;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "状态")
    private String email;
    @ApiModelProperty(value = "状态")
    private String password;

}
