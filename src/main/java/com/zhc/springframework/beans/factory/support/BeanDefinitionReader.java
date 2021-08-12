package com.zhc.springframework.beans.factory.support;

import com.zhc.springframework.beans.BeansException;
import com.zhc.springframework.core.io.Resource;
import com.zhc.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    /**
     * getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，加载和注册，
     * 这两个方法的实现会包装到抽象类中，以免污染具体的接口实现方法
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... location) throws BeansException;

}
