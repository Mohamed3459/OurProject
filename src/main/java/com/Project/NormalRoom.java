package com.Project;

public class NormalRoom extends Room{

    private int capacity;
   
    public NormalRoom(int roomNumber){
        super(roomNumber);
        this.capacity = 3; // default normal room can have 3 patients
        
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}
