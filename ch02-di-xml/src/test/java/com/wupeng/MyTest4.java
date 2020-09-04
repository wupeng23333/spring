package com.wupeng;

import com.wupeng.bao4.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {
    @Test
    public void test01(){
        String config="bao4/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student student=(Student) ac.getBean("myStudent");
        System.out.println("student="+student);
    }
}
