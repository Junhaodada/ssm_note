package com.itheima.instance.static_factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args) {
        String xmlpath = "com/itheima/instance/static_factory/bean2s.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
        System.out.println(applicationContext.getBean("bean2"));
    }
}
