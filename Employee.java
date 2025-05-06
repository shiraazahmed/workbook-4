package com.pluralsight;

public class Employee {
    private double id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(double id, String name, String department, double payRate, double hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getRegHours() {
        return Math.min(40, hoursWorked);
    }
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }
    public double getTotalPay() {
        double regularPay = hoursWorked *= payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}
