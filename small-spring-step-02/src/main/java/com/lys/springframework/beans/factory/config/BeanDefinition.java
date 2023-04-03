package com.lys.springframework.beans.factory.config;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:24
 * @description 用于定义 Bean 实例化信息
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass=beanClass;
    }


    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
