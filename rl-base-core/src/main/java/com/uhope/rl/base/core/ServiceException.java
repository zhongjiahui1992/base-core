package com.uhope.rl.base.core;


/**
 * 服务（业务）异常如“ 账号或密码错误 ”，该异常只做INFO级别的日志记录
 * @see com.uhope.uip.config.WebMvcConfig
 * @author jiangjialiang on 2017/12/25
 * @version 3.0.0
 */
public class ServiceException extends RuntimeException {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
