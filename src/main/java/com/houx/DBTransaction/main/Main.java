package com.houx.DBTransaction.main;

import com.houx.DBTransaction.service.RoleListService;
import com.houx.DBTransaction.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/11/22
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        RoleListService roleListService = ctx.getBean(RoleListService.class);

        List<Role> roleList = new ArrayList<Role>();
        for (int i = 1; i <= 2; i++) {
            Role role = new Role();
            role.setRoleName("role_name_" + i);
            role.setNote("note_" + i);
            roleList.add(role);
        }
        int count = roleListService.insertRoleList(roleList);
        System.out.println(count);

    }
}
