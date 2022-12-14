package com.banksy.proxy02static;

import com.banksy.proxy02static.service.Impl.UserServiceImpl;

/**
 * 客户角色：【使用代理角色来进行一些操作】
 * @Author banksy
 **/
public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        proxy.setUserService(userService);

        proxy.add();
    }
}
