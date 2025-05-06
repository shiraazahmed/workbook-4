package com.pluralsight;

public class Employee {
    private double id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(double id, String name, String department, double payRate, double hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = this.punchInTime - 1;
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

    public void punchIn(double time1) {
        if (punchInTime == -1)  {
            punchInTime = time1;
            System.out.println("Name: " + getName() + " Punched in at " + time1);
        } else {
            System.out.println("Name " + getName() +  " Punched in at " + punchInTime);
        }

    }
    public void punchOut(double time2) {
        if (punchInTime == -1) {
            System.out.println("Name: " + getName() + "Has not punched in");
        } else {
            hoursWorked += getHoursWorked();
            System.out.println("Name: " + getName() + "Punched out " + time2 + " Worked for " + getHoursWorked());
            punchInTime = - 1;
// resets back after punching out
// -1 indicates has not punched in yet
    }

    }

}
