package com.houx.aop_test.main;

import com.houx.pojo.JuiceMaker2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import org.apache.log4j.Logger;

/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */
@Controller
public class Main {
    public static void main(String[] args) {
        testIoc();
    }


    public static void testIoc(){
        Logger logger = Logger.getLogger(Main.class);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        JuiceMaker2 juiceMaker2 = (JuiceMaker2) ctx.getBean("juiceMaker2");
        System.out.println(juiceMaker2.makeJuice());
        ctx.close();
    }


}
