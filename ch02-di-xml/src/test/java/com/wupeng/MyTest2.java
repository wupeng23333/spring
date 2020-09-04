package com.wupeng;

import com.wupeng.bao2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest2 {
    @Test
    public void test01(){
        String config="bao2/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student student=(Student) ac.getBean("myStudent");
        System.out.println("student="+student);
    }
}
