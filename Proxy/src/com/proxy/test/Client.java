package com.proxy.test;

import com.proxy.InvocationHandler;
import com.proxy.Proxy;
import com.proxy.TimeHandler;

public class Client {
    public static void main(String[] args) throws Exception {
        UserMgr userMgr = new UserMarImpl();
        InvocationHandler h = new TransactionHandler(userMgr);
        UserMgr u = (UserMgr)Proxy.newProxyInstance(UserMgr.class, h );
        u.addUser();

    }
}
