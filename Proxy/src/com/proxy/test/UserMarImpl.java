package com.proxy.test;

public class UserMarImpl implements UserMgr{
    @Override
    public void addUser() {
        System.out.println("1: 插入记录到User表");
        System.out.println("2: 做日志在另外一张表");
    }
}
