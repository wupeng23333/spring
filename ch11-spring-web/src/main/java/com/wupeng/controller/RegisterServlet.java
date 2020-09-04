package com.wupeng.controller;

import com.wupeng.domain.Student;
import com.wupeng.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strId=request.getParameter("id");
        String strName=request.getParameter("name");
        String strEmail=request.getParameter("email");
        String strAge=request.getParameter("age");
        //String config="applicationContext.xml";
        //ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        WebApplicationContext ac=null;
        /*String key=WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
       Object attr= getServletContext().getAttribute(key);
       if(attr!=null){
           ac=(WebApplicationContext) attr;
       }*/
        ServletContext sc=null;
        ac=WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        System.out.println("容器对象的信息："+ac);


        StudentService service= (StudentService) ac.getBean("studentService");
        Student student=new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.parseInt(strAge));
        service.addStudent(student);

        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
