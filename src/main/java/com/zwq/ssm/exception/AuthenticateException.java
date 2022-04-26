package com.zwq.ssm.exception;



/**
 * description: 全局异常
 * @author zwq
 * @date 2021/11/23 13:37
 */
public class AuthenticateException extends RuntimeException{
    private Integer code;
    public AuthenticateException(String msg) {
        super(msg);
        this.code=1;
    }

    public Integer getCode() {
        return code;
    }

}

