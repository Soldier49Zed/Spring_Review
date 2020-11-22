package com.houx.IoC.annotation.service.impl;

import com.houx.IoC.annotation.pojo.Role;
import com.houx.IoC.annotation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */

@Component("RoleService2")
public class RoleServiceImpl2 implements RoleService {

    @Autowired
    private Role role = null;

    public Role getRole() {
        return role;
    }

    // @Autowired
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id = " + role.getId());
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("note = " + role.getNote());
    }
}
