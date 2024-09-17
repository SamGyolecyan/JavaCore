package homeworks.medicalCenter.hospital;

import consoleColors.ChangeColor;
import homeworks.medicalCenter.comments.Comments;
import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.storage.DoctorStorage;
import homeworks.medicalCenter.storage.PatientStorage;

import java.util.Date;
import java.util.Scanner;

public class Hospital implements Comments, ChangeColor {

    public static Scanner scanner = new Scanner(System.in);
    public static DoctorStorage doctorStorage = new DoctorStorage();
    public static PatientStorage patientStorage = new PatientStorage();


    public static void main(String[] args) {
        // Hello world
        boolean isRunTime = true;

        while (isRunTime) {

            Comments.commentsPrint();

            String c = scanner.nextLine();

            switch (c) {
                case EXIT:
                    isRunTime = false;
                    System.out.println(ANSI_GREEN + "The program has ended" + "\n" +
                            ANSI_GREEN + "Thank you.");
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENT_BY_DOCTOR:
                    printAllPatientByDoctor();
                    break;
                case PRINT_ALL_PATIENT:
                    printAllPatient();
                    break;
                case PRINT_ALL_DOCTOR:
                    printAllDoctor();
                    break;
                default:
                    System.out.println(ANSI_RED + "Wrong comments!!" + ANSI_RESET);
            }


        }


    }


    private static void addDoctor() {
        System.out.println("Please input id, name, surname, phone, email, profession:");
        String doctorData = scanner.nextLine();
        String[] doctorArr = doctorData.split(",");

        if (doctorArr.length == 6) {
            Doctor doctor = new Doctor();
            String id = doctorArr[0];
            if (doctorStorage.getDoctorById(id) == null) {
                doctor.setId(id);
                doctor.setName(doctorArr[1]);
                doctor.setSurname(doctorArr[2]);
                doctor.setPhone(doctorArr[3]);
                doctor.setEmail(doctorArr[4]);
                doctor.setProfession(doctorArr[5]);
                doctorStorage.addDoctor(doctor);
                System.out.println(ANSI_GREEN + "Doctor is added!!" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Number Id " + id + "already exists!!" + ANSI_RESET);
            }
        } else {
            System.out.println(ANSI_RED + "Please, input all!!!" + ANSI_RESET);

        }
    }

    private static void searchDoctorByProfession() {
        doctorStorage.printDoctor();
        System.out.println("Please, input Doctor's profession:");
        String profession = scanner.nextLine();
        doctorStorage.searchDoctorByProfession(profession);
    }

    private static void deleteDoctorById() {
        doctorStorage.printDoctor();
        System.out.println("Please, input Doctor Id:");
        String id = scanner.nextLine();
        doctorStorage.deleteDoctorById(id);
        System.out.println(ANSI_GREEN + "The Doctor with id " + id + "is delete!!" + ANSI_RESET);
    }

    private static void changeDoctorById() {
        doctorStorage.printDoctor();
        System.out.println("Please, choose Doctor Id:");
        String doctorId = scanner.nextLine();
        System.out.println("Please, input new Doctor name:");
        String doctorName = scanner.nextLine();
        System.out.println("Please, input new Doctor surname:");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please, input new Doctor phone:");
        String doctorPhone = scanner.nextLine();
        System.out.println("Please, input new Doctor email:");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please, input new Doctor profession:");
        String doctorProfession = scanner.nextLine();
        Doctor doctor = new Doctor();

        if (doctorId != null && !doctorId.isEmpty()) {
            doctor.setId(doctorId);
        }

        if (doctorName != null && !doctorName.isEmpty()) {
            doctor.setName(doctorName);
        }

        if (doctorSurname != null && !doctorSurname.isEmpty()) {
            doctor.setName(doctorSurname);
        }

        if (doctorPhone != null && !doctorPhone.isEmpty()) {
            doctor.setName(doctorPhone);
        }

        if (doctorEmail != null && !doctorEmail.isEmpty()) {
            doctor.setName(doctorEmail);
        }

        if (doctorProfession != null && !doctorProfession.isEmpty()) {
            doctor.setName(doctorProfession);
        }

        System.out.println(ANSI_GREEN + "The Doctor is already update!!!" + ANSI_RESET);

    }

    private static void addPatient() {
        System.out.println("Please, choose Doctor Id:");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);

        if (doctor != null) {
            System.out.println("Please, input patient Id:");
            String patientId = scanner.nextLine();
            System.out.println("Please, input patient name:");
            String patientName = scanner.nextLine();
            System.out.println("Please, input patient surname:");
            String patientSurname = scanner.nextLine();
            System.out.println("Please, input patient phone:");
            String patientPhone = scanner.nextLine();

            Patient patient = new Patient(patientId, patientName, patientSurname, patientPhone, doctor, new Date());
            Patient patientById = patientStorage.getPatientById(patientId);
            if (patientById == null) {
                patientStorage.addPatient(patient);
            }
            System.out.println(ANSI_GREEN + "The patient is added!!" + ANSI_RESET);

        } else {
            System.out.println(ANSI_RED + "Wrong id" + ANSI_RESET);
        }
    }

    private static void printAllPatientByDoctor() {
        System.out.println("Please, input Doctor's Id:");
        String id = scanner.nextLine();
        patientStorage.printPatient(id);
    }

    private static void printAllPatient() {
        patientStorage.printAllPatient();
    }

    private static void printAllDoctor() {
        doctorStorage.printDoctor();
    }
}
