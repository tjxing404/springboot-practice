package com.springboot.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author jxtian
 * @Date 2023/12/5
 */
@Component
public class DemoService {


    private final AspectObject aspectObject = new AspectObject();

    public String sayHello() {
        aspectObject.printHelloWord();
        return "Hello World!";
    }
}
