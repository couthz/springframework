package com.zhc.springframework.test;

import com.zhc.springframework.beans.factory.config.BeanDefinition;
import com.zhc.springframework.beans.factory.BeanFactory;
import com.zhc.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        //1. 初始化bean工厂
        BeanFactory beanFactory = new BeanFactory();

        //2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3. 获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
