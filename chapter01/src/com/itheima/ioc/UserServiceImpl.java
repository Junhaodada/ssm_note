package com.itheima.ioc;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userService say hello World !");
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao=userDao;
    }
}
