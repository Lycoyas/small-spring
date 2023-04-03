package com.lys.springframework;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:24
 * @description 用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean=bean;
    }

    public Object getBean(){
        return bean;
    }



}
