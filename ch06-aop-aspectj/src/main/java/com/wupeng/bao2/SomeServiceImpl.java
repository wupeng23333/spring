package com.wupeng.bao2;

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
}
