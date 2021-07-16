package com.zhc.springframework.beans.factory.config;

/**一个获取单例对象的接口*/
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
