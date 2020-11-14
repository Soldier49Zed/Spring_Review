package com.houx.bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */
public class DisposableBeanImpl implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("调用接口DisposableBean的destroy方法");
    }

}
