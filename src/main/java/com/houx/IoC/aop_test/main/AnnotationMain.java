package com.houx.aop_test.main;

import com.houx.annotation.config.ApplicationConfig;
import com.houx.annotation.pojo.PojoConfig;
import com.houx.annotation.pojo.Role;
import com.houx.annotation.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */
public class AnnotationMain {

    public static void main(String[] args) {
        //test1();
        test2();
    }


    private static void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role = context.getBean(Role.class);
        System.err.println(role.getId());
    }

    private static void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = context.getBean(Role.class);
        RoleService roleService = context.getBean(RoleService.class);
        roleService.printRoleInfo(role);
        context.close();
    }
}
