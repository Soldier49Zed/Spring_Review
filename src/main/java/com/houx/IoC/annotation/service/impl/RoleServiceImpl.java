package com.houx.IoC.annotation.service.impl;

import com.houx.IoC.annotation.service.RoleService;
import com.houx.IoC.annotation.pojo.Role;
import org.springframework.stereotype.Component;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id = " + role.getId());
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("note = " + role.getNote());
    }
}
