package com.wupeng;

import com.wupeng.bao1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test(){
        String config="applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        Student student= (Student) ac.getBean("myStudent");
        System.out.println("Student"+student);
    }

}
