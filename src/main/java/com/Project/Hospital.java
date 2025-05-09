package com.Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    public ArrayList<Patient> patientsList= new ArrayList<>();//default value given by java is 10
    public ArrayList<Doctor> doctors = new ArrayList<>();
    private int numOfNormalRooms;
    private int numOfSurgeryRooms;

    private SurgeryRoom[] surgeryRooms = new SurgeryRoom[numOfSurgeryRooms];
    private NormalRoom [] normalRooms = new NormalRoom [numOfNormalRooms];
    
    public Hospital(int numOfNormalRooms, int numOfSurgeryRooms ) { //Initializing the rooms objects
    for (int i = 0; i < numOfNormalRooms; i++) {
        normalRooms[i] = new NormalRoom(i + 1);
    }
    for (int i = 0; i < numOfSurgeryRooms; i++) {
        surgeryRooms[i] = new SurgeryRoom(i + 1, "General Surgery");
    }
}

    public void getPatientMedicalHistory(int ID){
        if(ID >=0 && ID< patientsList.size()){
            System.out.println("Medical History of " + patientsList.get(ID).getName()+" is "+patientsList.get(ID).medicalHistory);
        }
        else
        {
            System.out.println("Invalid ID");
        }
        
        }
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
    public void reserveNormalRoom(){
        
        
    }
    public void reserveSurgeryRoom(){
        
    }
        public void showAllDoctors(){
        System.out.println("Doctors List:");
        for (Doctor d : doctors){
          //  System.out.println(d.getInfo());

        }
    }
       public String searchPatient( int id ){
        for (Patient p : patientsList){
        if (p.getId()==id){
            return p.getName();
        }
        }
        return "This Patient not found";
    }
    public void AddNewDoctor(Doctor doctor){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Doctor data: \nname:");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("gender:");
        String gender = scanner.nextLine();
        System.out.print("Speciality:");
        String speciality = scanner.nextLine();
        int id = doctors.size()+1;
       // Doctor doctor = new Doctor(name, gender,age, id, speciality);
        doctors.add(doctor);  
    }

       
}
