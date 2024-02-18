package com.springboot.practice.service;

import org.springframework.stereotype.Component;

/**
 * @Author jxtian
 * @Date 2024/2/18
 */


public class AspectObject {

    public void printHelloWord() {
        System.out.println("Hello World!");
        printHelloWordOwn();
    }

    public void printHelloWordOwn() {
        System.out.println("Own Hello World!");
    }
}
