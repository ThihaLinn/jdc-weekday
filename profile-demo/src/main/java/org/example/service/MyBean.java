package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
