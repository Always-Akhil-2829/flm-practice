package com.spring.com.spring;

import com.spring.configs.SpringConfig;
import com.spring.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    void main(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = applicationContext.getBean("student",Student.class);
        System.out.println(student);

    }
}
