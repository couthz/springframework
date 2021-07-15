package com.zhc.springframework.beans.factory.support;

import com.zhc.springframework.beans.BeansException;
import com.zhc.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            /**其实这块会埋下一个坑，有构造函数入参的对象怎么处理？*/
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        /**直接调用 addSingleton 方法存放到单例对象的缓存中去*/
        addSingleton(beanName, bean);
        return bean;
    }
}
