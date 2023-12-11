package com.demo;

import com.demo.bean.Student;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        return new Student();
    }

    public PrettyTime prettyTime(){
        return  new PrettyTime();
    }
}
