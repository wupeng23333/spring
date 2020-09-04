package com.wupeng.service.impl;

import com.wupeng.dao.StudentDao;
import com.wupeng.service.StudentService;
import com.wupeng.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
       int nums= studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students=studentDao.selectStudents();
        return students;
    }
}
