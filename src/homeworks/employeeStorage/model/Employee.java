package homeworks.employeeStorage.model;

import java.util.Objects;

public class Employee {

    private String name;
    private String surName;
    private String employeeID;
    private int salary;
    private Company company;
    private String position;

    public Employee(String name, String surName, String employeeID, int salary, Company company, String position) {
        this.name = name;
        this.surName = surName;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && Objects.equals(employeeID, employee.employeeID) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, employeeID, salary, company, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company=" + company +
                ", position='" + position + '\'' +
                '}';
    }
}
