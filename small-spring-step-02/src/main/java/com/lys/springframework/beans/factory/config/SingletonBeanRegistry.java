package com.lys.springframework.beans.factory.config;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:48
 * @description 单例注册接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
