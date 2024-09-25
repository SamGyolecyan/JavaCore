package homeworks.onlineShop.megazin;

import homeworks.onlineShop.components.Order;
import homeworks.onlineShop.components.Product;
import homeworks.onlineShop.components.User;
import homeworks.onlineShop.exceptions.OutOfStockException;
import homeworks.onlineShop.information.LoginLogoutByAdmin;
import homeworks.onlineShop.information.LoginLogoutByUser;
import homeworks.onlineShop.information.LoginRegister;
import homeworks.onlineShop.shopStorages.OrderStorage;
import homeworks.onlineShop.shopStorages.ProductStorage;
import homeworks.onlineShop.shopStorages.UserStorage;
import homeworks.onlineShop.shopTypes.OrderStatus;
import homeworks.onlineShop.shopTypes.PaymentMethod;
import homeworks.onlineShop.shopTypes.ProductType;
import homeworks.onlineShop.shopTypes.UserType;

import java.util.Date;
import java.util.Scanner;

public class RunShop implements LoginRegister, LoginLogoutByAdmin, LoginLogoutByUser {

    public static Scanner scanner = new Scanner(System.in);
    public static UserStorage userStorage = new UserStorage();
    public static ProductStorage productStorage = new ProductStorage();
    public static OrderStorage orderStorage = new OrderStorage();



    public static void main(String[] args) {

        boolean isRun = true;

        while(isRun) {

            LoginRegister.printLoginRegister();
            String command = scanner.nextLine();

            switch (command) {
                case LoginRegister.LOGIN:
                    inputUser();
                    break;
                case LoginRegister.REGISTER:
                    addUser();
                    break;
                case LoginRegister.LOGOUT:
                    isRun = false;
                    break;
                default:
                    System.out.println("Wrong command!!!");
            }
        }

    }



    private static void inputUser() {
        System.out.println("Please input User type(ADMIN or USER):");
        try {
            UserType type = UserType.valueOf(scanner.nextLine().toUpperCase());
            if (type == UserType.ADMIN) {
                LoginLogoutByAdmin.printLoginLogoutAdmin();
                String command = scanner.nextLine();
                switch (command) {
                    case LoginLogoutByAdmin.LOGOUT:
                        LoginRegister.printLoginRegister();
                        break;
                    case LoginLogoutByAdmin.ADD_PRODUCT:
                        addProduct();
                        break;
                    case LoginLogoutByAdmin.REMOVE_PRODUCT_BY_ID:
                        removeProductById();
                        break;
                    case LoginLogoutByAdmin.PRINT_ALL_PRODUCTS:
                        printAllProducts();
                        break;
                    case LoginLogoutByAdmin.PRINT_ALL_USERS:
                        printAllUsers();
                        break;
                    case LoginLogoutByAdmin.PRINT_All_ORDERS:
                        printAllOrders();
                        break;
                    case LoginLogoutByAdmin.CHANGE_ORDER_STATUS:
                        changeOrderStatus();
                        break;
                }

            } else if (type == UserType.USER) {
                LoginLogoutByUser.printLoginRegisterUser();
                String command = scanner.nextLine();
                switch (command) {
                    case LoginLogoutByUser.LOGOUT:
                        LoginRegister.printLoginRegister();
                        break;
                    case LoginLogoutByUser.PRINT_ALL_PRODUCTS:
                        printAllProducts();
                        break;
                    case LoginLogoutByUser.BUY_PRODUCT:
                        buyProduct();
                        break;
                    case LoginLogoutByUser.PRINT_MY_ORDERS:
                        printMyOrders();
                        break;
                    case LoginLogoutByUser.CANCEL_ORDER_BY_ID:
                        cancelOrderById();
                        break;

                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Please, write right volume:");
        }

    }

    private static void cancelOrderById() {
        System.out.println("Please input order id:");
        String id = scanner.nextLine();
        orderStorage.deleteOrderById(id);
    }

    private static void changeOrderStatus() {
        System.out.println("Please input Order status:");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.nextLine().toUpperCase());
        Product product = new Product();
        int zeroPrice = 0;
        if (orderStatus == OrderStatus.DELIVERED) {
            zeroPrice = zeroPrice - product.getPrice();
        }
        product.setPrice(zeroPrice);
    }

    private static void printMyOrders() {
        System.out.println("Please input Product id:");
        String id = scanner.nextLine();
    }

    private static void buyProduct() {
        System.out.println("Please input Product id:");
        String id = scanner.nextLine();
        System.out.println("Please input Product quantity:");
        int qty  = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Product payment method (CARD,CASH or PAYPAL):");
        PaymentMethod paymentMethod = PaymentMethod.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Please input Order status ( NEW, DELIVERED or CANCELED):");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.nextLine().toUpperCase());
        Product product = new Product();
        try {
            if (qty == product.getStockQty()) {
                int newPrice = 0;
                if (product.getId().equals(id)) {
                    newPrice = qty * product.getPrice();
                }
                System.out.println("Do You want to buy this product in this quantity and at this price?");
                String msg = scanner.nextLine();
                Order order = new Order(id, new User(), product, new Date(), newPrice, orderStatus, qty, paymentMethod);
                orderStorage.addOrder(order);
            }
        } catch (OutOfStockException e) {
            System.out.println("Please, check qty!!");
        }
    }

    private static void printAllOrders() {
        orderStorage.printAllOrders();
    }

    private static void printAllUsers() {
        System.out.println("Please input User type USER:");
        try {
            UserType type = UserType.valueOf(scanner.nextLine().toUpperCase());
            if (type == UserType.USER) {
                userStorage.printAllUsers();
            } else {
                System.out.println("Please input only USER:");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Please, write right volume:");
        }
    }

    private static void removeProductById() {
        System.out.println("Please input Product id:");
        String id = scanner.nextLine();
        productStorage.removeProductById(id);
    }

    private static void printAllProducts() {
        productStorage.printAllProducts();
    }

    private static void addProduct() {
        System.out.println("Please input product id:");
        String id = scanner.nextLine();
        System.out.println("Please input product name:");
        String name = scanner.nextLine();
        System.out.println("Please input product description:");
        String description = scanner.nextLine();
        System.out.println("Please input product price:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input product quantity:");
        int qty = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input product type (ELECTRONICS, CLOTHING or BOOKS):");
        ProductType type = ProductType.valueOf(scanner.nextLine().toUpperCase());
        Product product = new Product(id, name, description, price, qty, type);
        Product productId = productStorage.getProductById(id);
        if (productId == null) {
            productStorage.addProduct(product);
            System.out.println("Product is added!!!");
        } else {
            System.out.println("Product with id " + id + "is exists!!!");
        }
    }

    private static void addUser() {
        System.out.println("Please input User id:");
        String id = scanner.nextLine();
        System.out.println("Please input User name:");
        String name = scanner.nextLine();
        System.out.println("Please input User email:");
        String email = scanner.nextLine();
        System.out.println("Please input User password:");
        String password = scanner.nextLine();
        System.out.println("Please input User type (ADMIN or USER):");
        UserType type = UserType.valueOf(scanner.nextLine().toUpperCase());
        User user = new User(id, name, email, password, type);
        User userId = userStorage.getUserById(id);
        if (userId == null) {
            userStorage.addUser(user);
            System.out.println("User is added!!!");
        } else {
            System.out.println("User with id " + id + "is exists!!!");
        }
    }

}
