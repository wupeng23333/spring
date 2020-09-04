package com.wupeng;

import com.wupeng.bao1.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest1 {
    @Test
    public void Test1() {
        String config="applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        SomeService proxy= (SomeService) ac.getBean("someService");
        System.out.println(proxy.getClass().getName());
        proxy.doSome("张三",15);
    }
}
