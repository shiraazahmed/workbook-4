package com.pluralsight;

public class ReservationClass {
    private String roomType;
    private int numNights;
    private boolean weekend;

    public ReservationClass(String roomType, int numNights, boolean weekend) {
        this.roomType = roomType;
        this.numNights = numNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumNights() {
        return numNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        double pricePerNight = 0.00;

        if ("king".equalsIgnoreCase(roomType)) {
            pricePerNight = 139.00;
        } else if ("double".equalsIgnoreCase(roomType)) {
            pricePerNight = 124.00;
        } else {
            throw new IllegalArgumentException("Not Available");
        }
        if (isWeekend()) {
            pricePerNight *= 1.10;
        }
        return pricePerNight;
    }
    public double getReservationTotal() {
        return getPrice() * numNights;
    }
}
