package com.lys.springframework.beans;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:48
 * @description 定义 Bean 异常
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
