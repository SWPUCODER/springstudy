package com.huang.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        /*userService.add();*/

        UserServiceProxy proxy = new UserServiceProxy();

        proxy.setUserService(userService);

        proxy.add();

    }
}
