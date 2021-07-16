package com.zhc.springframework.beans.factory.config;

import com.zhc.springframework.beans.PropertyValue;
import com.zhc.springframework.beans.PropertyValues;

/**
 * BeanDefinition，用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {

    /** Object替换为Class，这样就可以把 Bean 的实例化操作放到容器中处理了*/
    /**注册类信息，而不是直接注册实例化对象*/
    private Class beanClass;

    /*p5*/
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
