package com.wyb.muchi.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("blog")
public class Blog  extends Model<Blog> {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "描述")
    private String description;
    @ApiModelProperty(value = "文本")
    private String content;
    @ApiModelProperty(value = "更新时间")
    private String updateTime;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "状态")
    private String password;
    @ApiModelProperty(value = "创建时间")
    private String createTime;
}
