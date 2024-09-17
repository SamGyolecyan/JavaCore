package homeworks.employeeStorage.model;

import java.util.Objects;

public class Company {

    private String id;
    private String name;
    private String year;
    private String companyPhone;

    public Company(String id, String name, String year, String companyPhone) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.companyPhone = companyPhone;
    }

    public Company() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(year, company.year) && Objects.equals(companyPhone, company.companyPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, companyPhone);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                '}';
    }
}
