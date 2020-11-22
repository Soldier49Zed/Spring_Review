package com.houx.aop_test.game.service.impl;

import com.houx.aop_test.game.pojo.Role;
import com.houx.aop_test.game.service.RoleService;

/**
 * @Author: HouX
 * @Date: 2020/11/16
 * @Description:
 */
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("{id =" + role.getId()
                + ", roleName=" + role.getRoleName()
                + ", note=" + role.getNote());
    }
}
