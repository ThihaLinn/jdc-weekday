package org.example;

import org.example.bean.SpringBeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);

        SpringBeanOne springBeanOne = context.getBean(SpringBeanOne.class);
        springBeanOne.print();

    }
}