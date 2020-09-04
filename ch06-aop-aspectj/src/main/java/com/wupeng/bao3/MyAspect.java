package com.wupeng.bao3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around(value = "execution(* *..SomeService.doFirst(..))")
    public Object MyAround(ProceedingJoinPoint point) throws Throwable {
        String name="";
        Object arg[]=point.getArgs();
        if(arg!=null&&arg.length>1){
            name= (String) arg[0];
        }
        Object res=null;
        System.out.println("执行目标方法之前="+new Date());
        if(name.equals("zhangsan")){
            res=point.proceed();
        }
        System.out.println("执行目标方法之后");
        if(res!=null) res="hello";
        return res;
    }

}
