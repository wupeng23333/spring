package com.wupeng.bao1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    //@Before(value = "execution(void *..SomeServiceImpl.doSome(..))")
    @Before(value = "execution(public void com.wupeng.bao1.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法的签名（类名）="+joinPoint.getSignature());
        System.out.println("方法的名字="+joinPoint.getSignature().getName());
        Object arg[]=joinPoint.getArgs();
        for (Object a:arg){
            System.out.println("方法的参数="+a);
        }
        System.out.println("前置通知，当前时间="+new Date());
    }

}
