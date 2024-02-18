package com.springboot.practice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author jxtian
 * @Date 2024/2/18
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut(
            "execution( * com.springboot.practice.service.AspectObject.printHelloWord())")
    private void printHelloWord() {
    }

    @Pointcut(
            "execution( * com.springboot.practice.service.AspectObject.printHelloWordOwn())")
    private void printHelloWordOwn() {
    }

    @Around("printHelloWord()")
    public Object printHelloWord(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Before printHelloWord");
            return joinPoint.proceed();
        } catch (Throwable e) {

        }
        return null;
    }

    @Around("printHelloWordOwn()")
    public Object printHelloWordOwn(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Before printHelloWordOwn");
            return joinPoint.proceed();
        } catch (Throwable e) {

        }
        return null;
    }

}
