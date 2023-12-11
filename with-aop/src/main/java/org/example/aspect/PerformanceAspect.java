package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("@annotation(org.example.aspect.PerformanceLogger)")
    public Object performanceLogger(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object method = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s take time %d miliseconds.\n",
                joinPoint.getSignature().getName(),
                (endTime-startTime));

        return method;
    }

}
