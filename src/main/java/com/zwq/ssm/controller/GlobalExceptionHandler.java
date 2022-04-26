package com.zwq.ssm.controller;


import com.zwq.ssm.constant.PropertyMsg;
import com.zwq.ssm.exception.AuthenticateException;
import com.zwq.ssm.exception.InvalidSessionException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description: 全局异常处理
 *
 * @author zwq
 * @date 2021/9/8 14:58
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(InvalidSessionException.class)
    @ResponseBody
    public ModelAndView invalidSessionException(InvalidSessionException e, HttpServletRequest request, HttpServletResponse response) throws Exception{
        return new ModelAndView("/login");
    }


    @ExceptionHandler(AuthenticateException.class)
    @ResponseBody
    public PropertyMsg authenticateException(AuthenticateException e, HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("自定义异常");
        System.out.println(e.getCode());
        System.out.println(e.getMessage());
        return PropertyMsg.wrong(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseBody
    public PropertyMsg unauthorizedException(UnauthorizedException e, HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("没有权限");
        return PropertyMsg.wrong("没有权限");
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public PropertyMsg exceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("全局异常");
        logger.info("全局异常");
        e.printStackTrace();
        return PropertyMsg.wrong("服务器异常");

    }


}
