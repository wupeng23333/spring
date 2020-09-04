package com.wupeng;

import com.wupeng.bao1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        String config="bao1/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student student=(Student) ac.getBean("myStudent");
        System.out.println("student="+student);
        Date date=(Date) ac.getBean("date");
        System.out.println("date="+date);
    }
}
