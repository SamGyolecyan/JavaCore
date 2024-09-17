package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void addDoctor(Doctor doctor) {

        if (doctors.length == size) {
            extendDoctorStorage();
        }

        doctors[size++] = doctor;
    }

    public void extendDoctorStorage() {

        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);

        doctors = tmp;
    }

    public void printDoctor() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public int getIndexDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return doctors[i];
            }
        }

        return null;
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                System.out.println(doctors[i]);
            }
        }
    }

    public void deleteDoctorById(String id) {
        int index = getIndexDoctorById(id);
        for (int i = index + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }
}
