package com.wupeng;

import com.wupeng.bao3.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {
    @Test
    public void Test1() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        String str = proxy.doOther("zhangsan", 28);
    }

    @Test
    public void Test2() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        System.out.println(proxy.getClass().getName());
        String str=proxy.doFirst("zhangsan", 15);
        System.out.println(str);
    }
}
