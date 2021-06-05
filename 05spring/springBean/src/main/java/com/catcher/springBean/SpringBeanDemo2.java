package com.catcher.springBean;

import com.catcher.springBean.Entity.Person;
import com.catcher.springBean.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanDemo2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springBeanDemo2.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.init();

    }
}
