package com.itheima.jdk;

public class jdkTest {
    public static void main(String[] args) {
        jdkProxy jdkProxy = new jdkProxy();
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
