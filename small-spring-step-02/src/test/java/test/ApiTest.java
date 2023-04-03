package test;

import com.lys.springframework.beans.factory.config.BeanDefinition;
import com.lys.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserService;

/**
 * @author Lycoyas
 * @create 2023-04-03 14:25
 * @description
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();

    }
}
