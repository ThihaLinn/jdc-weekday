package com.demo;

import com.demo.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext bean = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = bean.getBean(Student.class);
        System.out.println(student.getName());

    }
}
