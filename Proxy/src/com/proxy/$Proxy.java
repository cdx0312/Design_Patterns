package com.proxy;
import java.lang.reflect.Method;
public class $Proxy implements com.proxy.test.UserMgr{
Moveable moveable;
public $Proxy(InvocationHandler h) {
this.h = h;
}
com.proxy.InvocationHandler h;
@Override
public void addUser(){
Method md = null;
try {
md = com.proxy.test.UserMgr.class.getMethod("addUser");
} catch (NoSuchMethodException e) {
e.printStackTrace();
}
h.invoke(this, md);
}
}