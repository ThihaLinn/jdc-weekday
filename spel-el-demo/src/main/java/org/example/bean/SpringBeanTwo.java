package org.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo {


    @Value("13")
    public int taxAmount;
}
