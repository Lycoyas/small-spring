package com.lys.springframework.beans.factory.support;


import com.lys.springframework.beans.BeansException;
import com.lys.springframework.beans.factory.BeanFactory;
import com.lys.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:49
 * @description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {

        //先找单例
        Object bean=getSingleton(name);
        if(bean!=null){
            return bean;
        }

        //找不到单例就创建Bean
        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name, beanDefinition);

    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
