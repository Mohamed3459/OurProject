package com.Project;

public class SurgeryRoom extends Room {
     private String surgeryType;

    public SurgeryRoom(int roomNumber, String surgeryType) {
    super(roomNumber); 
    this.surgeryType = surgeryType;
    }
    public String getSurgeryType() {
        return surgeryType;
    }
    public void setSurgeryType(String surgeryType) {
    this.surgeryType = surgeryType;
    }
}
