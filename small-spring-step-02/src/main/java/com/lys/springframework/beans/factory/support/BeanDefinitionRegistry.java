package com.lys.springframework.beans.factory.support;

import com.lys.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:49
 * @description
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
