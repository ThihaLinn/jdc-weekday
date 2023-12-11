package org.example.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CurrencyServiceImplAspect {

    @Pointcut("this(org.example.service.CurrencyService)")
    public void targetPointcut(){



    }
    //@Before("targetPointcut()")
    public void currencyAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s method invoked before with %s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }

}
