package com.lys.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:24
 * @description 代表了 Bean 对象的工厂,可以存放 Bean 定义到 Map 中以及获取。
 */
public class BeanFactory {
    //ConcurrentHashMap 线程安全的，支持并发
    private Map<String,BeanDefinition> beanDefinitionMap=new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
