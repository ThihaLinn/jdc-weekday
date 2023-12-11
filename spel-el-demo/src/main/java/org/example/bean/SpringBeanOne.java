package org.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {

    @Value("#{'${app.street.name}'.toUpperCase()}")
    public String streetName;

    @Value("#{springBeanTwo.taxAmount}")
    public int taxAmount;

    @Value("#{100*5}")
    public int discountAmount;

    public void print(){
        System.out.println("StreetName :"+streetName);
        System.out.println("TaxAmount :"+taxAmount);
        System.out.println("DiscountAmount :"+discountAmount);
    }

}
