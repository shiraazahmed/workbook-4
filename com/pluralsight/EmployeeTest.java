package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() { //added test for punchIn method
        Employee employee = new Employee(1, "John Bond", "Spy", 20, 45);
        employee.punchIn(10.0);
        assertEquals(10.0, employee.getHoursWorked());
    }

    @Test
    void punchOut() {
        Employee employee = new Employee(1, "John Bond", "Spy", 20, 45);
        employee.punchIn(10.0);
        employee.punchOut(5.0);
        assertEquals(5.0, employee.getHoursWorked());
    }
}