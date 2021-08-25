package com.huang.demo04;

import com.huang.demo02.UserService;
import com.huang.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler phi = new ProxyInvocationHandler();

        phi.setTarget(userService);//设置要代理的对象

        //动态生成代理类
        UserService proxy = (UserService) phi.getProxy();

        proxy.add();

    }
}
