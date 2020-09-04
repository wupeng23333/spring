package com.wupeng.handler;

import com.wupeng.utils.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        ServiceTools.doLog();
        res = method.invoke(target, args);
        ServiceTools.doDate();
        return res;
    }
}
