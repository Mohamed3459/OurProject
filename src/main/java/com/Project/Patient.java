package com.Project;

/**
 *
 * @author Mohamed Tarek
 */
public class Patient extends Person{
    private Doctor assignedDoctor;
    String medicalHistory;
    public Patient(String name, String gender, int age, int id, String medicalHistory){
        super(name,gender, age, id);
        this.medicalHistory = medicalHistory;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    @Override
    public String toString() {
        return "Patient{ name= "+this.name+" gender: "+this.gender+" age: "+this.age + " assignedDoctor=" + assignedDoctor + ", medicalHistory=" + medicalHistory +" Id: "+this.id+ '}';
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: "+this.name+"\nage: "+this.age+"\ngender: "+this.gender+"\nid: "+this.id+"\nMedical History: "+this.medicalHistory+"\nAssigned Doctor: "+this.assignedDoctor);
    }
    //The difference btween the toString and the displayInfo is that toString prints the id but displayInfo doesn't
}
