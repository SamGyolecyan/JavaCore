package homeworks.employeeStorage.storage;

import chapter5.Comma;
import homeworks.employeeStorage.model.Company;
import homeworks.employeeStorage.model.Employee;

public class EmployeeStorage {

    private Employee[] emp = new Employee[10];
    private int size;

    public void addEmployee(Employee employee) {
        if (emp.length == size) {
            extandEmployee();
        }
        emp[size++] = employee;
    }

    public void extandEmployee() {
        Employee[] tmp = new Employee[emp.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = emp[i];
            System.arraycopy(emp, 0, tmp, 0, size);
        }
        emp = tmp;
    }

    public void searchEmployeeByID(String id) {
        for (int i = 0; i < size; i++) {
            if (emp[i].getEmployeeID().equals(id)) {
                System.out.println(emp[i]);
            }
        }
    }


    public void searchEmployeeByCompanyName(String company) {
        for (int i = 0; i < size; i++) {
            if (emp[i].getCompany().equals(company)) {
                System.out.println(emp[i]);
            }
        }
    }

    public Employee getEmployeeID(String id) {
        for (int i = 0; i < size; i++) {
            if (emp[i].getEmployeeID().equals(id)) {
                return emp[i];
            }
        }

        return null;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(emp[i]);
        }
    }

    public Employee searchEmployeeByCompanyName(Company company) {
        for (int i = 0; i < size; i++) {
            if (emp[i].getCompany().equals(company)) {
                return emp[i];
            }
        }
        return null;
    }
}
