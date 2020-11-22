package com.houx.DBTransaction.mapper;

import com.houx.DBTransaction.pojo.Role;
import org.springframework.stereotype.Repository;

/**
 * @Author: HouX
 * @Date: 2020/11/22
 * @Description:
 */
@Repository
public interface RoleMapper {
    int insertRole(Role role);
}
