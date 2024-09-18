package homeworks.medicalCenter.model;

import consoleColors.ChangeColor;
import homeworks.medicalCenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private Doctor doctor;
    private Date registerDateTime;


    public Patient(String id, String name, String surname, String phone, Doctor doctor, Date registerDateTime) {
        super(id, name, surname, phone);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient() {

    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                ChangeColor.ANSI_YELLOW + "Id=" + ChangeColor.ANSI_YELLOW + "'" + ChangeColor.ANSI_RESET + getId() + ChangeColor.ANSI_YELLOW + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_YELLOW + ", name=" + ChangeColor.ANSI_YELLOW + "'" + ChangeColor.ANSI_RESET + getName() + ChangeColor.ANSI_YELLOW + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_YELLOW + ", surname=" + ChangeColor.ANSI_YELLOW + "'" + ChangeColor.ANSI_RESET + getSurname() + ChangeColor.ANSI_YELLOW + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_YELLOW + ", phoneNumber=" + ChangeColor.ANSI_YELLOW + "'" + ChangeColor.ANSI_RESET + getPhone() + ChangeColor.ANSI_YELLOW + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_YELLOW + ", doctor=" + ChangeColor.ANSI_YELLOW + "'" + ChangeColor.ANSI_RESET + doctor + ChangeColor.ANSI_YELLOW + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_YELLOW + ", registerDateTime=" + ChangeColor.ANSI_YELLOW + "'" + ChangeColor.ANSI_RESET + DateUtil.fromHourToString(registerDateTime) + ChangeColor.ANSI_YELLOW + "\'" + ChangeColor.ANSI_RESET +
                '}';
    }
}
