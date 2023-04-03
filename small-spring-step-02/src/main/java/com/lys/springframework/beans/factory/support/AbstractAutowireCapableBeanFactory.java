package com.lys.springframework.beans.factory.support;

import com.lys.springframework.beans.BeansException;
import com.lys.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:49
 * @description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean=null;
        try {
            bean=beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed",e);
        }

        addSingleton(beanName,bean);
        return bean;
    }
}
