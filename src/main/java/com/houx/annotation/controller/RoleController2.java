package com.houx.annotation.controller;

import com.houx.annotation.pojo.Role;
import com.houx.annotation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */

@Component
public class RoleController2 {

    @Autowired
    private RoleService roleService = null;

    //装载带有参数的构造方法类
    public RoleController2(@Autowired RoleService roleService) {
        this.roleService = roleService;
    }

    public void printRole(Role role){
        roleService.printRoleInfo(role);
    }
}
