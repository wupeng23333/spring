package com.wupeng;

import com.wupeng.bao3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {
    @Test
    public void test01(){
        String config="bao3/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student student=(Student) ac.getBean("myStudent");
        System.out.println("student="+student);
    }
}
