package com.itheima.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        // 定义配置文件路径
        String xmlPath = "com/itheima/scope/bean4s.xml";
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(xmlPath);
        // 输出获得实例
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));
    }
}

