package org.example;

import org.example.service.ActionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
          context.registerShutdownHook();
//        context.getEnvironment().setActiveProfiles("file");
//        context.register(AppConfig.class);
//        context.refresh();
        ActionService actionService = context.getBean(ActionService.class);
        actionService.takeAction();

    }
}