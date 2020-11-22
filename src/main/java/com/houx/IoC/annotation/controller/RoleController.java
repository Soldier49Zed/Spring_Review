package com.houx.IoC.annotation.controller;

import com.houx.IoC.annotation.pojo.Role;
import com.houx.IoC.annotation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */

@Component
public class RoleController {

    @Autowired
    @Qualifier("roleService3")//消除歧义，因为一个接口可能有多个实现类，@Qualifier可以按照名称的方式进行注入
    private RoleService roleService = null;

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    public void printRole(Role role){
        roleService.printRoleInfo(role);
    }
}
