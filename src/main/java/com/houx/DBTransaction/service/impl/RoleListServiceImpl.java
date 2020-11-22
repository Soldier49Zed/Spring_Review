package com.houx.DBTransaction.service.impl;

import com.houx.DBTransaction.pojo.Role;
import com.houx.DBTransaction.service.RoleListService;
import com.houx.DBTransaction.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RoleListServiceImpl implements RoleListService {

    @Autowired
    private RoleService roleServic = null;
    Logger log = Logger.getLogger(RoleListServiceImpl.class);


    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int insertRoleList(List<Role> roleList) {

        int count = 0;
        for (Role role : roleList){

            try {
                count+= roleServic.insertRole(role);
            } catch (Exception e) {
                log.info(e);
            }
        }

        return count;
    }
}
