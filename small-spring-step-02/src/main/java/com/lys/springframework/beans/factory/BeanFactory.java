package com.lys.springframework.beans.factory;

import com.lys.springframework.beans.BeansException;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:24
 * @description 代表了 Bean 对象的工厂
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;


}
