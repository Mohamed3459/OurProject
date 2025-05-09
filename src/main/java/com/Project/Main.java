package com.Project;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogInManager logIn= new LogInManager("Admin","password");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.println("\nEnter Password: ");
        String password = scanner.next();
        System.out.println(logIn.isLoginSuccessful(username, password));
        Hospital hospital = new Hospital(50, 50);// 50 Normal rooms, 50 surgery Rooms
        hospital.addNewPatient();
     //   hospital.getAllPatients();
        hospital.getPatientMedicalHistory(0);
         hospital.addNewPatient();
         hospital.getPatientMedicalHistory(1);
    }
}
