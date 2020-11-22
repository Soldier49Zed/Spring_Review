package com.houx.IoC.aop_test.game;

/**
 * @Author: HouX
 * @Date: 2020/11/16
 * @Description:
 */
public class ProxyBeanFactory {
    public static <T> T getBean(T obj, Interceptor interceptor) {
        T t = (T) ProxyBeanUtil.getBean(obj, interceptor);
        return t;
    }
}
