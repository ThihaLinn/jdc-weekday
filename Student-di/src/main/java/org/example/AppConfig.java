package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

    //@Bean
    //@Autowired
    public Student student(Address address){
       return null;
    }

    //@Bean
    public Address address(){
        Address address = new Address();
        address.setCity("Dream Land");
        return address;
    }

}
