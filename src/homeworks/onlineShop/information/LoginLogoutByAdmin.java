package homeworks.onlineShop.information;

public interface LoginLogoutByAdmin {

    String LOGOUT = "0";
    String ADD_PRODUCT = "1";
    String REMOVE_PRODUCT_BY_ID = "2";
    String PRINT_ALL_PRODUCTS = "3";
    String PRINT_ALL_USERS = "4";
    String PRINT_All_ORDERS = "5";
    String CHANGE_ORDER_STATUS = "6";

    static void printLoginLogoutAdmin() {
        System.out.println("Please input " + LOGOUT + " for logout");
        System.out.println("Please input " + ADD_PRODUCT + " for add product");
        System.out.println("Please input " + REMOVE_PRODUCT_BY_ID + " for remove product by id");
        System.out.println("Please input " + PRINT_ALL_PRODUCTS + " for print all products");
        System.out.println("Please input " + PRINT_ALL_USERS + " for print all users");
        System.out.println("Please input " + PRINT_All_ORDERS + " for print all orders");
        System.out.println("Please input " + CHANGE_ORDER_STATUS + " for change order status");
    }
}
