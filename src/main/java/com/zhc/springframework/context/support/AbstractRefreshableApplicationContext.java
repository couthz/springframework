package com.zhc.springframework.context.support;

import com.zhc.springframework.beans.BeansException;
import com.zhc.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zhc.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * p7:获取Bean工厂和加载资源
 * 在 refreshBeanFactory() 中主要是获取了 DefaultListableBeanFactory 的实例化以及对资源配置的加载操作 loadBeanDefinitions(beanFactory)，在加载完成后即可完成对 spring.xml 配置文件中 Bean 对象的定义和注册，同时也包括实现了接口 BeanFactoryPostProcessor、BeanPostProcessor 的配置 Bean 信息。
 * 但此时资源加载还只是定义了一个抽象类方法 loadBeanDefinitions(DefaultListableBeanFactory beanFactory)，继续由其他抽象类继承实现。
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }


}
