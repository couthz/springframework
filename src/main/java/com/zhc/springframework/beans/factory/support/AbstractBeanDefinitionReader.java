package com.zhc.springframework.beans.factory.support;

import com.zhc.springframework.core.io.DefaultResourceLoader;
import com.zhc.springframework.core.io.ResourceLoader;

/**
 * 抽象类把 BeanDefinitionReader 接口的前两个方法全部实现完了，
 * 并提供了构造函数，让外部的调用使用方，把Bean定义注入类，传递进来。
 * 这样在接口 BeanDefinitionReader 的具体实现类中，就可以把解析后的 XML 文件中的 Bean 信息，
 * 注册到 Spring 容器去了。以前我们是通过单元测试使用，调用 BeanDefinitionRegistry 完成Bean的注册，
 * 现在可以放到 XMl 中操作了
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    //注册器,面向接口编程,之前可能觉得BeanDefinitionRegistry这个接口没什么卵用
    private final BeanDefinitionRegistry registry;

    //资源加载器
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    /**
     * 感觉这里像开了个口，允许你定义自己的ResourceLoader???
     * @param registry
     * @param resourceLoader
     */
    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
