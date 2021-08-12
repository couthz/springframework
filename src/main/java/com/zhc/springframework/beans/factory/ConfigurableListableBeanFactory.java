package com.zhc.springframework.beans.factory;

import com.zhc.springframework.beans.BeansException;
import com.zhc.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.zhc.springframework.beans.factory.config.BeanDefinition;
import com.zhc.springframework.beans.factory.config.BeanPostProcessor;
import com.zhc.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    @Override
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
