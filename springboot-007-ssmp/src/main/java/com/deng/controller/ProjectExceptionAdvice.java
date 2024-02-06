package com.deng.controller;

import com.deng.controller.utils.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 该类用于统一异常数据和正常数据的格式，方便前端开发人员使用
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public R exceptionHandler(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试");
    }
}
