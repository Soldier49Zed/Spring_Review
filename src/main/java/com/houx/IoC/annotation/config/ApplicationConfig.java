package com.houx.annotation.config;

import com.houx.annotation.service.impl.RoleServiceImpl;
import com.houx.annotation.pojo.Role;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */

//以下三种ComponentScan方式选一种

@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class})
//@ComponentScan(basePackages = {"com.houx.annotation.pojo", "com.houx.annotation.service"})
//@ComponentScan(basePackages = {"com.houx.annotation.pojo", "com.houx.annotation.service"}, basePackageClasses = {Role.class, RoleServiceImpl.class})
public class ApplicationConfig {
}
