package com.houx.DBTransaction.service.impl;

import com.houx.DBTransaction.mapper.RoleMapper;
import com.houx.DBTransaction.pojo.Role;
import com.houx.DBTransaction.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/11/22
 * @Description:
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper = null;

    private ApplicationContext ctx = null;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
    public int insertRoleList(List<Role> roleList){
        int count = 0;

        //从容器中获取RoleService对象，实际是一个代理对象
        RoleService service = ctx.getBean(RoleService.class);
        for (Role role : roleList){
            try {
                //调用自身类的方法，产生自调用问题
                service.insertRole(role);
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return count;
    }
}
