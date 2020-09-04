package com.wupeng;

import com.wupeng.dao.StudentDao;
import com.wupeng.domain.Student;
import com.wupeng.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest1 {
    @Test
    public void Test(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        String names[]=ac.getBeanDefinitionNames();
        for(String na:names){
            System.out.println("对象名称="+na+"类名="+ac.getBean(na));
        }
    }
    @Test
    public void Test2(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentDao dao= (StudentDao) ac.getBean("studentDao");
        Student student=new Student(1007,"王万","10944321472qq.com",20);
        int nums=dao.insertStudent(student);
        System.out.println("nums="+nums);
        }

    @Test
    public void Test3(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentService service= (StudentService) ac.getBean("studentService");
        Student student=new Student(1008,"王里","10944321472qq.com",20);
        int nums=service.addStudent(student);
        System.out.println("nums="+nums);
    }
    @Test
    public void Test4(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentService service= (StudentService) ac.getBean("studentService");
       List<Student> students=service.queryStudents();
       for(Student student:students){
           System.out.println("student="+student);
       }
    }
}
