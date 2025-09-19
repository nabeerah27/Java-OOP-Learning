package _05_Inheritance;

// Parent class
class Employee {
    final String name; // final variable: cannot be reassigned after initialization

    public Employee(String name) {
        this.name = name; // final variable initialized via constructor
    }

    public final void work() { // final method: cannot be overridden by child classes
        System.out.println("Employee is working...");
    }

    public void sleep() { // normal method: can be overridden
        System.out.println("Employee is sleeping...");
    }
}

// Child class
class Manager extends Employee {

    public Manager(String name) {
        super(name); // call parent constructor to set color
    }

    /* Cannot override final method in parent
    @Override
    public void work() { } */

    @Override
    public void sleep() { // overriding normal method
        System.out.println("Manager is sleeping...");
    }
}

public class _08_Final_Method {
    public static void main(String[] args) {

        System.out.println("========= Employee reference type =========");

        Employee employee = new Manager("Jack"); // Employee reference, Manager object
        employee.work();   // calls final method from parent (cannot be overridden)
        employee.sleep();  // calls overridden sleep method from Manager
        // employee.name = "Luna"; -> ERROR: cannot reassign final variable
        System.out.println(employee.name); // can access final variable

        System.out.println("========= Manager reference type =========");

        Manager manager = new Manager("Julie"); // Manager reference, Manager object
        manager.work();   // calls final method from parent
        manager.sleep();  // calls overridden stop method from Bus
        // manager.name = "Julie"; -> ERROR: cannot reassign final variable
        System.out.println(manager.name); // access final variable

    }
}
