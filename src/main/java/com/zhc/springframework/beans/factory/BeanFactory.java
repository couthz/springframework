package com.zhc.springframework.beans.factory;


import com.zhc.springframework.beans.BeansException;

/**
 * BeanFactory，代表了 Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取。
 * 在 Bean 工厂的实现中，包括了 Bean 的注册，这里注册的是 Bean 的定义信息。同时在这个类中还包括了获取 Bean 的操作。
 */
public interface BeanFactory {

    Object getBean(String name);

    /**p4*/
    /**参考源码, 获取 Bean 时把构造函数的入参信息传递进去了*/
    Object getBean(String name, Object... args) throws BeansException;

}
