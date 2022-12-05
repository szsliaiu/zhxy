package com.htre.zhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.htre.zhxy.pojo.LoginForm;
import com.htre.zhxy.pojo.Student;

/**
 * @author panjinsheng
 * @date 2022/10/18/14:29
 * @description:
 */
public interface StudentService extends IService<Student> {
    Student login(LoginForm loginForm);

    Student getStudentById(Long userId);

    IPage<Student> getStudentByOpr(Page<Student> pageParam, Student student);
}
