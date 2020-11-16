package com.houx.game.service.impl;

import com.houx.game.pojo.Role;
import com.houx.game.service.RoleService;

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
