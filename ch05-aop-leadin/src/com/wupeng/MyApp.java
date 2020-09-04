package com.wupeng;

import com.wupeng.handler.MyInvocationHandler;
import com.wupeng.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        SomeService target = new SomeServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(target);
        SomeService service= (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        service.doSome();
    }


}
