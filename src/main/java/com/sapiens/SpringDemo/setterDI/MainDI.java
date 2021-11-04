package com.sapiens.SpringDemo.setterDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI {
    public static void main(String[] args) {
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
        Communication communication1 = (Communication) context1.getBean("communication1");
        communication1.communication();

        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
        Communication communication2 = (Communication) context2.getBean("communication2");
        communication2.communication();

        AbstractApplicationContext context3 = new ClassPathXmlApplicationContext("Beans.xml");
        Communication communication3 = (Communication) context3.getBean("communication3");
        communication3.communication();

        AbstractApplicationContext context4 = new ClassPathXmlApplicationContext("Beans.xml");
        Communication communication4 = (Communication) context4.getBean("communication4");
        communication4.communication();
    }
}
