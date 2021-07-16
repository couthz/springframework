package com.zhc.springframework.beans.factory.support;

import com.zhc.springframework.beans.BeansException;
import com.zhc.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*p4. jdk实例化*/
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        /*从bean定义中中拿到class类对象*/
        Class clazz = beanDefinition.getBeanClass();
        try {
            /**
             * 如果为空则是无构造函数实例化，否则就是需要有构造函数的实例化。
             */
            if (null != ctor) {
                /*重点关注有构造函数实例化*/
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
