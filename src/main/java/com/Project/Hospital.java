package com.Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    public ArrayList<Patient> patientsList= new ArrayList<>();//default value given by java is 10
    public ArrayList<Doctor> doctors = new ArrayList<>();
    public void addNewPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Patient data: \nname:");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("gender:");
        String gender = scanner.nextLine();
        System.out.print("Medical History:");
        String medicalHistory = scanner.nextLine();
        int id = patientsList.size()+1;
        Patient patient = new Patient(name, gender,age, id, medicalHistory);
        patientsList.add(patient);
        
    }
    public void getAllPatients(){
        for(int i = 0; i< patientsList.size();i++){
            System.out.println(patientsList.get(i).toString());
            System.out.println("");
        }
    }
    public void assignPatientToDoctor(int patientId, int doctorId){
        
    }
    public void assignPatientToDoctor(String patientName, String doctorName){ //Method Overloading
        
    }
}
