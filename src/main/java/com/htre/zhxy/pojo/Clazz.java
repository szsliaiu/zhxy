package com.htre.zhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author panjinsheng
 * @date 2022/10/18/14:16
 * @description: 班级信息
 */
@ApiModel(value = "班级信息")
@Data
@TableName("tb_clazz")
public class Clazz {
    @ApiModelProperty(value = "班级Id")
    //班级信息
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;             //班级Id
    @ApiModelProperty(value = "班级名称")
    private String name;            //班级名称
    @ApiModelProperty(value = "班级人数")
    private String number;          //班级人数
    @ApiModelProperty(value = "班级介绍")
    private String introducation;   //班级介绍
    @ApiModelProperty(value = "班主任姓名")
    //班主任信息
    private String headmaster;      //班主任姓名
    @ApiModelProperty(value = "班主任电话")
    private String telephone;       //班主任电话
    @ApiModelProperty(value = "班主任邮箱")
    private String email;           //班主任邮箱
    @ApiModelProperty(value = "班级所属年级")
    //所属年级
    private String gradeName;      //班级所属年级


}