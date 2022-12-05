package com.htre.zhxy.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author panjinsheng
 * @date 2022/10/18/14:16
 * @description: 用户登录表单信息
 */
@ApiModel(value = "用户登录表单信息")
@Data
public class LoginForm {

    private String username;
    private String password;
    private String verifiCode;
    private Integer userType;

}