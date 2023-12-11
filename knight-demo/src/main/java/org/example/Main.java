package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Knight knight = new Knight();
//        knight.setQuest(new SingYoYeYoQuest());
//        System.out.println(knight.goQuest());

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.goQuest());

    }
}