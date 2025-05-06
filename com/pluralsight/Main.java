package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 139.00,true, true);
        System.out.println("Room 1 Available.."+ room1.isAvailable());

        Room room2 = new Room(2,139.00, false, false);
        System.out.println("Room 2 Available.." + room2.isAvailable());

        Room room3 = new Room(1, 124.00, false, true);
        System.out.println("Room 3 Available.." + room3.isAvailable());

        ReservationClass reservationClass1 = new ReservationClass("king", 2,true);
        System.out.println("Reservation for Room 1 Price per Night $" + reservationClass1.getPrice());
        System.out.println("Reservation Total $" + reservationClass1.getReservationTotal());

        ReservationClass reservationClass2 = new ReservationClass("double", 1, false);
        System.out.println("Reservation for Room 2 Price per Night $" + reservationClass2.getPrice());
        System.out.println("Reservation Total $" + reservationClass2.getReservationTotal());

        ReservationClass reservationClass3 = new ReservationClass("king",1, false);
        System.out.println("Reservation for Room 3 Price per Night $" + reservationClass3.getPrice());
        System.out.println("Reservation Total $" + reservationClass3.getReservationTotal());

        Employee employee1 = new Employee(007,"Bond","Spy", 20, 45);
        System.out.println("Employee Id: " + employee1.getId());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee Department: " + employee1.getDepartment());
        System.out.println("Employee Pay Rate: $" + employee1.getPayRate());
        System.out.println("Employee Hours Worked: " + employee1.getHoursWorked());
        System.out.println("Employee Total Pay $" + employee1.getTotalPay());

        room1.checkIn();
        System.out.println("Room 1 Occupied: ");
        room1.cleanRoom();

        room1.checkOut();
        System.out.println("Room 1 is Available After Checkout " + room1.isAvailable());
        room1.cleanRoom();

        employee1.punchIn(10.0);
        employee1.punchOut(5.0);

        System.out.println("Employee " + employee1 + "Hours Worked" + employee1.getHoursWorked() + "hours");
        System.out.println("Total Pay $" + employee1.getTotalPay());
    }
}
