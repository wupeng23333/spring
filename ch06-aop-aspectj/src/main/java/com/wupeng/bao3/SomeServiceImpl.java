package com.wupeng.bao3;

import com.wupeng.bao2.Student;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("执行了doSome方法");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("执行了doOther方法");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student=new Student();
        student.setName("LiSi");
        student.setAge(55);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("执行了doFirst方法");
        return "doFirst";
    }
}
