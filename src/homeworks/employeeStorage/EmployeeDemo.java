package homeworks.employeeStorage;

import homeworks.employeeStorage.model.Company;
import homeworks.employeeStorage.model.Employee;
import homeworks.employeeStorage.numbers.Numbers;
import homeworks.employeeStorage.storage.CompanyStorage;
import homeworks.employeeStorage.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Numbers {

    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) {

        boolean runEmployee = true;

        while (runEmployee) {

            System.out.println();
            Numbers.viewNumbers();

            String c = scanner.nextLine();

            switch (c) {
                case EXIT:
                    runEmployee = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    printAllEmployee();
                    break;
                case PRINT_ALL_COMPANY:
                    printAllCompany();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeByID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchEmployeeByCompanyName();
                    break;
            }
        }

    }

    private static void searchEmployeeByCompanyName() {
        employeeStorage.print();
        System.out.println("Please, input Company id:");
        String id = scanner.nextLine();
        Company company = companyStorage.getCompanyByID(id);
        employeeStorage.searchEmployeeByCompanyName(company);
    }

    private static void addCompany() {
        companyStorage.print();
        System.out.println("Please, input Company id, name, year, companyPhone:");
        String companyData = scanner.nextLine();
        String[] companyDataArr = companyData.split(",");

        if (companyDataArr.length == 4) {
            String id = companyDataArr[0];
            Company company = new Company();
            if (companyStorage.getCompanyByID(id) == null) {
                company.setId(id);
                company.setName(companyDataArr[1]);
                company.setYear(companyDataArr[2]);
                company.setCompanyPhone(companyDataArr[3]);
                companyStorage.addCompany(company);
                System.out.println("Company added!!");
            } else {
                System.out.println("Company with id " + id + "already exists");
            }
        }

    }


    private static void addEmployee() {
        employeeStorage.print();
        System.out.println("Please, input Company id:");
        String id = scanner.nextLine();
        Company company = companyStorage.getCompanyByID(id);

        if (company != null) {
            System.out.println("Please, input employee's name:");
            String name = scanner.nextLine();
            System.out.println("Please, input employee's surname:");
            String surName = scanner.nextLine();
            System.out.println("Please, input employee's ID:");
            String ID = scanner.nextLine();
            System.out.println("Please, input employee's salary:");
            int salary = 0;
            try {
                salary = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please, input only digits");
            }
            System.out.println("Please, input employee's position:");
            String position = scanner.nextLine();
            Employee employee = new Employee(name, surName, ID, salary, company, position);
            Employee employeeID = employeeStorage.getEmployeeID(ID);
            if (employeeID == null) {
                employeeStorage.addEmployee(employee);
                System.out.println("Employee is added in list!!");
                System.out.println();
            } else {
                System.out.println("Employee with " + ID + " already exists!!");
            }
        }
    }


    private static void printAllEmployee() {
        employeeStorage.print();
    }

    private static void printAllCompany() {
        companyStorage.print();
    }

    private static void searchEmployeeByID() {
        System.out.println("Please, input employee's ID:");
        String ID = scanner.nextLine();
        employeeStorage.searchEmployeeByID(ID);

    }

}
