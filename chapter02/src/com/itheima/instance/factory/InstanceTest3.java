package com.itheima.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
    public static void main(String[] args) {
        String xmlpath = "com/itheima/instance/factory/bean3s.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
        System.out.println(applicationContext.getBean("bean3"));
    }
}
