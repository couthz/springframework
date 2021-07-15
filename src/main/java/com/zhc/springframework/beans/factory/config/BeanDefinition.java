package com.zhc.springframework.beans.factory.config;

/**
 * BeanDefinition，用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {

    /** Object替换为Class，这样就可以把 Bean 的实例化操作放到容器中处理了*/
    /**注册类信息，而不是直接注册实例化对象*/
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
