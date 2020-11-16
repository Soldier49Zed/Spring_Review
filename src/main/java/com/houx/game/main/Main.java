package com.houx.game.main;

import com.houx.game.Interceptor;
import com.houx.game.ProxyBeanFactory;
import com.houx.game.interceptor.RoleInterceptor;
import com.houx.game.pojo.Role;
import com.houx.game.service.RoleService;
import com.houx.game.service.impl.RoleServiceImpl;

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
