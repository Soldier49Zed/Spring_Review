package com.houx.IoC.annotation.service;

import com.houx.IoC.annotation.pojo.Role;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description:
 */
public interface RoleDataSourceService {
	public Role getRole(Long id);
}
