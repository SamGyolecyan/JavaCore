package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Patient;

public class PatientStorage {

    private Patient[] patients = new Patient[10];

    private int size;

    public void addPatient(Patient patient) {
        if (patients.length == size) {
            extendPatient();
        }
        patients[size++] = patient;
    }

    public void extendPatient() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, size);

        patients = tmp;
    }

    public void printPatient(String id) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().getId().equals(id)) {
                System.out.println(patients[i]);
            }
        }
    }

    public Patient getPatientById(String id) {
        int index = getIndexById(id);
        for (int i = index + 1; i < size; i++) {
            if (patients[i].getId().equals(id)) {
                return patients[i];
            }
        }
        return null;
    }

    public int getIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void printAllPatient() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }
}
