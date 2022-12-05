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
 * @description: 年级及年级主任信息
 */
@ApiModel(value = "年级及年级主任信息")
@Data
@TableName("tb_grade")
public class Grade {

    //年级信息
    @ApiModelProperty(value = "年级ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;             //年级ID
    @ApiModelProperty(value = "年级名称")
    private String name;            //年级名称
    @ApiModelProperty(value = "年级介绍")
    private String introducation;   //年级介绍
    //年级主任信息
    @ApiModelProperty(value = "年级主任姓名")
    private String manager;         //年级主任姓名
    @ApiModelProperty(value = "年级主任邮箱")
    private String email;           //年级主任邮箱
    @ApiModelProperty(value = "年级主任电话")
    private String telephone;       //年级主任电话

}