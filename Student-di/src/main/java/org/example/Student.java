package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class Student {

    /*
    * Annotation Config DI
    * 1.field injection
    * */
    private String name = "Thiha";

    private final Address address;

    public void printInfo(){
        System.out.printf("%s lives in %s.%n",
                name,address.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
