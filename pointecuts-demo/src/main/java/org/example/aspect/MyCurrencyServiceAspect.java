package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.annotation.Secured;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Aspect
@Component
public class MyCurrencyServiceAspect {

    @Pointcut("@target(org.example.annotation.Secured)")
    public void annotationTarget(){

    }

    @Around("AnnotaionPointCut()")
    public Object annnotationAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        try {
            System.out.println("BeforeAround advice::"+joinPoint.getSignature().getName());
           String returnType = (String) joinPoint.proceed();
            System.out.println("Return Type::"+returnType);
        }catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("AfterAround advice::"+joinPoint.getSignature().getName());
        }
        return null;
    }


    //@AfterThrowing(value = "annotationTarget()",throwing = "exception")
    public void annotationTargetAfterThrowingAdvice(JoinPoint joinPoint,Exception exception) {
        System.out.println(
                String.format("%s's %s method invoked before with %s and throw exception is[%s]",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()),
                        exception.getCause())
        );
    }

    //@AfterReturning(value = "annotationTarget()",returning = "returning")
    public void annotationTargetAfterReturningAdvice(JoinPoint joinPoint,Object returning) {
        System.out.println(
                String.format("%s's %s method invoked before with %s and return value is[%s]",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()),
                        returning)
        );
    }

    //@Before("annotationTarget()")
    public void annotationTarget(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }

    @Pointcut("@args(org.example.annotation.Validated)")
    public void AnnotaionArgs(){

    }


    //@Before("AnnotaionArgs()")
    public void AnnotationArgsAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }

    @Pointcut("args(int,int)")
    public void argsPointcut(){

    }
    //@Before("argsPointcut()")
    public void argsPointcut(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }



    @Pointcut("bean(myCurrencyService)")
    public void beanPointcut(){

    }
    //@After("AnnotaionPointCut()")
    public void beanAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Pointcut("within(org.example.service.*)")
    public void  withinPointcut(){

    }
    @Pointcut("@within(org.example.annotation.Secured)")
    public void annotaionWithinPointcut(){

    }

    @Pointcut("@annotation(org.example.annotation.InTransaction))")
    public void AnnotaionPointCut(){

    }

    //@Before("AnnotaionPointCut()")
    public void currencyAnnotation(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }


    //@Before("annotaionWithinPointcut()")
    public void currencyAnnitationWithPointcut(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }


    //@Before("withinPointcut()")
    public void currencyAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s's %s method invoked before with %s",
                        joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }

}
