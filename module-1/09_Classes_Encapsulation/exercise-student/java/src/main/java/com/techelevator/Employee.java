package com.techelevator;

public class Employee {

    private int employeeId;            //instance variables
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;


    public Employee(int employeeId, String firstName, String lastName, double salary) { //constructor
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;

    }

    public String getFullName() {
        return this.lastName + ", " + this.firstName;
    }

    public void raiseSalary(double percent) {
        this.annualSalary = (annualSalary/100) * percent + annualSalary;

    }


    //getters and setters


    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getEmployeeId() {
        return this.employeeId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public double getAnnualSalary() {
        return this.annualSalary;
    }
    //this not needed but for best practice
}
