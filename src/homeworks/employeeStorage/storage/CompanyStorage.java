package homeworks.employeeStorage.storage;

import homeworks.employeeStorage.model.Company;
import homeworks.employeeStorage.model.Employee;

public class CompanyStorage {
    private Company[] com = new Company[10];
    private int size;

    public void addCompany(Company company) {
        if (com.length == size) {
            extandCompany();
        }
        com[size++] = company;
    }

    public void extandCompany() {
        Company[] tmp = new Company[com.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = com[i];
            System.arraycopy(com, 0, tmp, 0, size);
        }
        com = tmp;
    }

    public void searchCompanyByID(String id) {
        for (int i = 0; i < size; i++) {
            if (com[i].getId().equals(id)) {
                System.out.println(com[i]);
            }
        }
    }


    public Company getCompanyByID(String id) {
        for (int i = 0; i < size; i++) {
            if (com[i].getId().equals(id)) {
                return com[i];
            }
        }

        return null;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(com[i]);
        }
    }
}
