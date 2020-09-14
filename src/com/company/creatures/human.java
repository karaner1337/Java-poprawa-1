package com.company.creatures;

import com.company.creatures.animal;
import com.company.devices.car;
import com.company.devices.phone;

import java.util.Date;

public class human {
    public String name;
    animal pet;
    public com.company.devices.car car;
    private Double salary = 1200.0;
    Double cash = 0.0;
    phone phone;

    Date date = new Date();

    public String toString() {
        return salary + " " + name;
    }

    public void addMyCar(car car) {
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
    public double getCash() {
        return cash + salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }
    public animal getPet() {
        return pet;
    }
    public void setPet(animal pet) {
        this.pet = pet;
    }
    public phone getPhone() {
        return phone;
    }
    public void setPhone(phone phone) {
        this.phone = phone;
    }
}