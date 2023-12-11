package org.example;

import org.example.bean.SpringBean4;
import org.example.bean.SpringBean5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public SpringBean4 springBean4(){
        return new SpringBean4();
    }

    @Bean
    public SpringBean5 springBean5(){
        return new SpringBean5();
    }

}
