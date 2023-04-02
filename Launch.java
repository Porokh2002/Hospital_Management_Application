package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Patient {
    String name;
    private int age;
    private long phoneNo;
    private String address;

    public Patient(String name, int age, long phoneNo, String address) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phoneNo + "]";
    }

}

class Doctor {
    String docName;
    private int docAge;
    private Long docPhoneNo;
    private String docSpecialization;
    private String docQualification;

    public Doctor(String docName, int docAge, long docPhoneNo, String docSpecialization, String docQualification) {
        this.docName = docName;
        this.docAge = docAge;
        this.docPhoneNo = docPhoneNo;
        this.docQualification = docQualification;
        this.docSpecialization = docSpecialization;

    }

    @Override
    public String toString() {
        return "Doctor [name=" + docName + ", specialization=" + docSpecialization + ", phone=" + docPhoneNo
                + ", qualification=" + docQualification + ", Age=" + docAge + ", ]";
    }

}

class Hospital {
    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;

    public Hospital() {
        patients = new ArrayList<Patient>();
        doctors = new ArrayList<Doctor>();
    }

    public void addPatient(Patient e) {
        patients.add(e);
    }

    public void removePatient(Patient e) {

        patients.remove(e);
    }

    public void addDoctor(Doctor e) {
        doctors.add(e);
    }

    public void removeDoctor(Doctor e) {
        doctors.remove(e);
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("----****-----****-----****----");
            System.out.println("No patient is available");
            System.out.println("----****-----****-----****----");

        } else {
            System.out.println("List of all patients:");
            Iterator<Patient> itr = patients.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }

    }

    public void displayAllDoctors() {
        System.out.println("List of Doctors:");
        Iterator<Doctor> itr1 = doctors.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}

class Launch {
    public static void main(String[] args) {
        Hospital hp = new Hospital();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t \t \t \t****-----****-----****");
        System.out.println("\t \t \t Welcome to Hospital Management System");
        System.out.println("\t \t \t \t****-----****-----****");
        while (true) {

            System.out.println("\t\t\t Click 1 to add patient");
            System.out.println("\t\t\t Click 2 to add doctor");
            System.out.println("\t\t\t Click 3 to display patients list");
            System.out.println("\t\t\t Click 4 to disply the doctors list");
            System.out.println("\t\t\t Click 5 to remove a patient");
            System.out.println("\t\t\t Click 6 to remove a doctor");
            System.out.println("\t\t\t Click 7 to exit the program");
            System.out.println("Please Select an Option:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----****-----****-----****----");
                    System.out.println("Kindly enter the patient details");
                    System.out.println("----****-----****-----****----");
                    System.out.println("Enter you name:");
                    String name = sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter your age:");
                    int age = sc.nextInt();
                    System.out.println("Enter your phoneNo:");
                    long phoneNo = sc.nextLong();
                    System.out.println("Enter your address");
                    String address = sc.nextLine();
                    address = sc.nextLine();

                    Patient p = new Patient(name, age, phoneNo, address);
                    hp.addPatient(p);
                    System.out.println("----****-----****-----****----");
                    System.out.println("Patient added succesfully:");
                    System.out.println("----****-----****-----****----");
                    break;
                case 2:
                    System.out.println("----****-----****-----****----");
                    System.out.println(":Kindly enter doctor details:");
                    System.out.println("----****-----****-----****----");
                    System.out.println("Enter the name of doctor:");
                    String docName = sc.nextLine();
                    docName = sc.nextLine();
                    System.out.println("Enter the age of doctor:");
                    int docAge = sc.nextInt();
                    System.out.println("Enter Specialization:");
                    String docSpecialization = sc.nextLine();
                    docSpecialization = sc.nextLine();
                    System.out.println("Enter doctor qualification:");
                    String docQualification = sc.nextLine();
                    // sc.nextLine();
                    System.out.println("Enter doctor phone no:");
                    long docPhoneNo = sc.nextLong();

                    Doctor d = new Doctor(docName, docAge, docPhoneNo, docSpecialization, docQualification);
                    hp.addDoctor(d);
                    System.out.println("----****-----****-----****----");
                    System.out.println("Doctor added successfullly");
                    System.out.println("----****-----****-----****----");
                    break;
                case 3:

                    hp.displayAllPatients();

                    System.out.println("----****-----****-----****----");
                    break;
                case 4:
                    hp.displayAllDoctors();
                    break;
                case 5:
                    System.out.println("----****-----****-----****----");
                    System.out.println("Enter name of the pateint to remove");
                    System.out.println("----****-----****-----****----");
                    String removePatient = sc.nextLine();
                    removePatient = sc.nextLine();
                    Iterator<Patient> pItr = hp.patients.iterator();
                    boolean flag = false;
                    while (pItr.hasNext()) {
                        Patient pName = pItr.next();
                        if (pName.name.equals(removePatient)) {
                            hp.removePatient(pName);
                            System.out.println("----****-----****-----****----");
                            System.out.println("Patient removed successfully");
                            System.out.println("----****-----****-----****----");
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("----****-----****-----****----");
                        System.out.println("Pateint not found");
                        System.out.println("----****-----****-----****----");
                    }
                    break;
                case 6:
                    System.out.println("----****-----****-----****----");
                    System.out.println("Enter name of the doctor to remove:");
                    System.out.println("----****-----****-----****----");
                    String removeDoctor = sc.nextLine();
                    removeDoctor = sc.nextLine();
                    Iterator<Doctor> docItr = hp.doctors.iterator();
                    boolean found = false;
                    while (docItr.hasNext()) {
                        Doctor doc = docItr.next();
                        if (doc.docName.equals(removeDoctor)) {
                            hp.removeDoctor(doc);
                            System.out.println("----****-----****-----****----");
                            System.out.println("Doctor removed successfully");
                            System.out.println("----****-----****-----****----");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("----****-----****-----****----");
                        System.out.println("Doctor not found");
                        System.out.println("----****-----****-----****----");
                    }
                    break;
                case 7:
                    System.out.println("----****-----****-----****----");
                    System.out.println("Exiting...");
                    System.out.println("----****-----****-----****----");
                    System.exit(0);
                    
                default:
                System.out.println("Invalid Input: Please Try Again...");
                    break;
            }
        }

    }
}