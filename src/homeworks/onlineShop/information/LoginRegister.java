package homeworks.onlineShop.information;

public interface LoginRegister {

    String LOGIN = "0";
    String REGISTER = "1";
    String LOGOUT = "2";

    static void printLoginRegister() {
        System.out.println("Please input " + LOGIN + " for login");
        System.out.println("Please input " + REGISTER + " for register");
        System.out.println("Please input " + LOGOUT + " for logout");
    }

}
