package com.company;

import java.util.Date;

import java.util.Date;

public class human {
    animal pet;
    public car car;
    private Double salary = 1200.0;

    Date date = new Date();

    void addMyCar(car car) {
        this.car = car;
    }
    public  car getCar(){
        return car;
    }
    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }
    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("wyplata musi byc dodatnia");
        } else {
            System.out.println("zaksiegowanie ");
            System.out.println("aneks od hani");
            System.out.println("zus i us");
            System.out.println("podwyzkaaa:" + salary*1.1);
            return this.salary = salary*1.1;

        }
        return this.salary = salary;
    }
}