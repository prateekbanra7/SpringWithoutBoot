package com.abc.withoutboot.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void saveUser(){
        System.out.println("user is saved successfully");

    }

}
