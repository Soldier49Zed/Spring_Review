package com.houx.DBTransaction.controller;

import com.houx.DBTransaction.pojo.Role;
import com.houx.DBTransaction.service.RoleListService;
import com.houx.DBTransaction.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: HouX
 * @Date: 2020/11/23
 * @Description:
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService = null;

    @Autowired
    private RoleListService roleListService = null;

    public void errerUserServices() {
        Role role1 = new Role();
        role1.setRoleName("role_name_1");
        role1.setNote("role_note_1");
        roleService.insertRole(role1);
        Role role2 = new Role();
        role2.setRoleName("role_name_2");
        role2.setNote("role_note_2");
        roleService.insertRole(role2);

    }

    @RequestMapping("/addRole")
    @ResponseBody
    public Role addRole(Role role) {
        roleService.insertRole(role);
        return role;
    }
}