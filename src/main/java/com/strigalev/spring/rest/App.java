package com.strigalev.spring.rest;

import com.strigalev.spring.rest.configuration.MyConfig;
import com.strigalev.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        // List<Employee> allEmployees = communication.getAllEmployees();
        // System.out.println(allEmployees);

        // Employee empByID = communication.getEmployee(1);
        // System.out.println(empByID);

        //Employee emp = new Employee("Evgeniy", "Petrosyan", "HR", 300);
        //communication.saveEmployee(emp);
        //Employee emp = new Employee("Evgeniy", "Petrosyan", "HR", 600);
        //emp.setId(12);
        //communication.saveEmployee(emp);

        communication.deleteEmployee(12);

    }
}
