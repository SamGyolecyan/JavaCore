package homeworks.onlineShop.shopStorages;

import homeworks.onlineShop.components.Order;
import homeworks.onlineShop.components.User;

public class OrderStorage {

    private Order[] orders = new Order[10];
    private int size;

    public void addOrder(Order order) {
        if (orders.length == size) {
            extand();
        }
        orders[size++] = order;
    }

    public void extand() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, size);
        orders = tmp;
    }

    public void printAllOrders() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public int getIndexOrderById(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public void deleteOrderById(String id) {
        int index = getIndexOrderById(id);
        for (int i = index + 1; i < size; i++) {
            orders[i - 1] = orders[i];
        }
        size--;
    }
}
