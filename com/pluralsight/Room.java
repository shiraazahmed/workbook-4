package com.pluralsight;

public class Room {
    private int numberBeds;
    private double bedPrice;
    private boolean isOccupancy;
    private boolean isDirty;

    public Room(int numberBeds, double bedPrice, boolean isOccupancy, boolean isDirty) {
        this.numberBeds = numberBeds;
        this.bedPrice = bedPrice;
        this.isOccupancy = isOccupancy;
        this.isDirty = isDirty;
    }

    public int getNumberBeds() {
        return numberBeds;
    }

    public double getBedPrice() {
        return bedPrice;
    }

    public boolean isOccupancy() {
        return isOccupancy;
    }

    public boolean isDirty() {
        return isDirty;
    }

    // Derived method
    public boolean isAvailable() {
        return !isDirty && !isOccupancy;
    }
    public void checkIn() {
        if (isAvailable()) {
            isOccupancy = true;
            isDirty = true;
            System.out.println("Room is Occupied and Needs Cleaning ");
        } else {
            System.out.println("Room is Booked");
        }
    }
    public void checkOut() {
        if (!isAvailable()) {
            isOccupancy = false;
            isDirty = true;
            cleanRoom();
            System.out.println("Room needs cleaning");
        } else {
            System.out.println("Room not available for guests. ");
        }

    }
    public void cleanRoom() {
        if (!isOccupancy & isDirty) {
            isDirty = false;
            System.out.println("Room is Cleaned ");
        } else if (isOccupancy) {
            System.out.println("Room is Occupied ");
        } else {
            System.out.println("Room already cleaned ");
        }
    }
}
