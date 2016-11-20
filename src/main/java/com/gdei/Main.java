package com.gdei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("carbean.xml");
        Car car = (Car) applicationContext.getBean("baoma");
        System.out.println(car);
    }
}
