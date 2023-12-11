package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AnotherCurrencyAspect {

    @Pointcut("this(org.example.service.AnotherCurrencyService)")
    public void anotherCurrencyPointcut(){

    }

    //@Before("anotherCurrencyPointcut()")
    public void currencyAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s method invoked before with %s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }

}
