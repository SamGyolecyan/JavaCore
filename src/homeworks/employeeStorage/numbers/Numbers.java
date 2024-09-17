package homeworks.employeeStorage.numbers;

public interface Numbers {

    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String ADD_COMPANY = "2";
    String PRINT_ALL_EMPLOYEE = "3";
    String PRINT_ALL_COMPANY = "4";
    String SEARCH_EMPLOYEE_BY_ID = "5";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "6";

    static void viewNumbers() {
        System.out.println("Please, input " + EXIT + " for EXIT");
        System.out.println("Please, input " + ADD_EMPLOYEE + " for ADD_EMPLOYEE");
        System.out.println("Please, input " + ADD_COMPANY + " for ADD_COMPANY");
        System.out.println("Please, input " + PRINT_ALL_EMPLOYEE + " for PRINT_ALL_EMPLOYEE");
        System.out.println("Please, input " + PRINT_ALL_COMPANY + " for PRINT_ALL_COMPANY");
        System.out.println("Please, input " + SEARCH_EMPLOYEE_BY_ID + " for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please, input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for SEARCH_EMPLOYEE_BY_COMPANY_NAME");
    }
}
