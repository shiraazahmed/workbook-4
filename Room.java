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
}
