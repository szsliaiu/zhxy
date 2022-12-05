package com.htre.zhxy.common;

/**
 * 自定义业务异常类
 * @author panjinsheng
 * @date 2022/09/23/20:11
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}