package com.htre.zhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.htre.zhxy.pojo.Admin;
import com.htre.zhxy.pojo.LoginForm;

/**
 * @author panjinsheng
 * @date 2022/10/18/14:24
 * @description:
 */
public interface AdminService extends IService<Admin> {

    Admin login(LoginForm loginForm);

    Admin getAdminById(Long userId);

    IPage<Admin> getAdminsByOpr(Page<Admin> pageParam, Admin admin);
}
