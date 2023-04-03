package com.lys.springframework.test;

import com.lys.springframework.BeanDefinition;
import com.lys.springframework.BeanFactory;
import com.lys.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:25
 * @description
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}
