package org.example.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy(value = false)
public class SpringBean3 {

    public SpringBean3() {
        System.out.println(this.getClass().getSimpleName());
    }
}
