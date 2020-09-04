package com.wupeng;

import com.wupeng.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeService someService=(SomeService) ac.getBean("someService");
        int num=ac.getBeanDefinitionCount();
        System.out.println("int="+num);
        someService.doSome();

    }
}
