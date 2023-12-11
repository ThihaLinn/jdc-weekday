package org.example;

import org.example.bean.SpringBean1;
import org.example.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();


    }
}