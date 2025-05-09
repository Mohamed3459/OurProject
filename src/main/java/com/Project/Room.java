package com.Project;


public class Room {
    protected int roomNumber;
    protected boolean isReserved;

    public Room(int roomNumber) {
    this.roomNumber = roomNumber;
    this.isReserved = false;
    }
    public int getRoomNumber() {
    return roomNumber;
    }

    public boolean isReserved() {
    return isReserved;
    }
}
