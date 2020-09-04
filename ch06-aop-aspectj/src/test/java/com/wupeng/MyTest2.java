package com.wupeng;

import com.wupeng.bao2.SomeService;
import com.wupeng.bao2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    @Test
    public void Test1() {
        String config="applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        SomeService proxy= (SomeService) ac.getBean("someService");
        String str=proxy.doOther("zhangsan",28);
    }
    @Test
    public void Test2() {
        String config="applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        SomeService proxy= (SomeService) ac.getBean("someService");
        Student student =proxy.doOther2("zhangsan",28);
        System.out.println(student);
    }
}
