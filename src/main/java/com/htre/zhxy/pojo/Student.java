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
 * @description: 学生信息
 */
@ApiModel(value = "学生信息")
@Data
@TableName("tb_student")
public class Student {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String sno;
    private String name;
    @ApiModelProperty(value = "性别默认男")
    private char gender = '男';//default
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String introducation;
    @ApiModelProperty(value = "存储头像的项目路径")
    private String portraitPath;//存储头像的项目路径
    @ApiModelProperty(value = "班级名称")
    private String clazzName;//班级名称

}