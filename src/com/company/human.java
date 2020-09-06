package com.company;

import com.company.devices.car;

import java.util.Date;

public class human {
    public String name;
    animal pet;
    public com.company.devices.car car;
    private Double salary = 1200.0;

    Date date = new Date();

    public String toString() {
        return salary + " " + name;
    }

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
    public void setNewCar(car car) {
        if (salary >= car.price) {
            System.out.println("kupujesz za sianko");
            getCar();
        } else if (salary > (car.price / 12)) {
            System.out.println("kredycik");
            getCar();
        } else {
            System.out.println("jestes biedny");
        }
    }
}