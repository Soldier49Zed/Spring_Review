package com.houx.aop_test.game;

/**
 * @Author: HouX
 * @Date: 2020/11/16
 * @Description:
 */
public interface Interceptor {

    public void before(Object obj);

    public void after(Object obj);

    public void afterReturning(Object obj);

    public void afterThrowing(Object obj);
}
