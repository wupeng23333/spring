package com.wupeng.bao1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component(value = "myStudent")
// @Component
@Component("myStudent")
public class Student {
    @Value("张三")
    private String name;
    @Value("45")
    private Integer age;
    @Autowired
    @Qualifier("mySchool")
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
