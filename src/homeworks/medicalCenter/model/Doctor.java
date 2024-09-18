package homeworks.medicalCenter.model;

import consoleColors.ChangeColor;

import java.util.Objects;

public class Doctor extends Person {

    private String email;
    private Profession profession;

    public Doctor(String id, String name, String surname, String phone, String email, Profession profession) {
        super(id, name, surname, phone);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                ChangeColor.ANSI_GREEN + "Id=" + ChangeColor.ANSI_GREEN + "'" + ChangeColor.ANSI_RESET + getId() + ChangeColor.ANSI_GREEN + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_GREEN + ", name=" + ChangeColor.ANSI_GREEN + "'" + ChangeColor.ANSI_RESET + getName() + ChangeColor.ANSI_GREEN + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_GREEN + ", surname=" + ChangeColor.ANSI_GREEN + "'" + ChangeColor.ANSI_RESET + getSurname() + ChangeColor.ANSI_GREEN + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_GREEN + ", phoneNumber=" + ChangeColor.ANSI_GREEN + "'" + ChangeColor.ANSI_RESET + getPhone() + ChangeColor.ANSI_GREEN + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_GREEN + ", email=" + ChangeColor.ANSI_GREEN + "'" + ChangeColor.ANSI_RESET + email + ChangeColor.ANSI_GREEN + "\'" + ChangeColor.ANSI_RESET +
                ChangeColor.ANSI_GREEN + ", profession=" + ChangeColor.ANSI_GREEN + "'" + ChangeColor.ANSI_RESET + profession + ChangeColor.ANSI_GREEN + "\'" + ChangeColor.ANSI_RESET +
                '}';
    }
}
