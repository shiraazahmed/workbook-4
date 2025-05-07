package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
    void checkIn() { //added test for checkIn method
        Room room = new Room(1, 139.00, true, true);
        room.checkIn();
        assertFalse(room.isAvailable());
    }

    @Test
    void checkOut() {
        Room room = new Room(1, 139.00, true, true);
        room.checkIn();
        room.checkOut();
        assertTrue(room.isAvailable());
    }

    @Test
    void cleanRoom() { //added test for cleanRoom method
        Room room = new Room(1, 139.00, true, true);
        room.checkIn();
        room.cleanRoom();
        assertFalse(room.isDirty());

    }
}