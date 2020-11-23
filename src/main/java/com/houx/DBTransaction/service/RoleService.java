package com.houx.DBTransaction.service;

import com.houx.DBTransaction.pojo.Role;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/11/22
 * @Description:
 */

public interface RoleService {
    public int insertRole(Role role);

    public int insertRoleList(List<Role> roleList);
}
