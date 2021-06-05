package com.catcher.springBean;

import com.catcher.springBean.Dao.StudentDao;
import com.catcher.springBean.Entity.Person;
import com.catcher.springBean.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanDemo1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springBeanDemo1.xml");

        //扫描指定包下的注解解析，此处是@Repository
        Person person = (Person) context.getBean("person");
        person.init();
    }
}
