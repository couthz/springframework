package com.zhc.springframework.beans.factory.support;

import com.zhc.springframework.beans.BeansException;
import com.zhc.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**p4*/
/**实例化策略接口*/
public interface InstantiationStrategy {

    /**
     *
     * @param beanDefinition
     * @param beanName
     * @param ctor  里面包含了一些必要的类信息，有这个参数的目的就是为了拿到符合入参信息相对应的构造函数
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}

