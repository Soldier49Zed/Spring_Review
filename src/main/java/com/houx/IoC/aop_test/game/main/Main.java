package com.houx.aop_test.game.main;

import com.houx.aop_test.game.Interceptor;
import com.houx.aop_test.game.ProxyBeanFactory;
import com.houx.aop_test.game.interceptor.RoleInterceptor;
import com.houx.aop_test.game.pojo.Role;
import com.houx.aop_test.game.service.RoleService;
import com.houx.aop_test.game.service.impl.RoleServiceImpl;

/**
 * @Author: HouX
 * @Date: 2020/11/16
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptor();

        //代理对象:proxy
        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);
        Role role = new Role(1l, "role_name_1", "role_note_1");

        proxy.printRole(role);
        System.out.println("#################################测试 afterThrowing#############################");
        role = null;
        proxy.printRole(role);
    }
}
