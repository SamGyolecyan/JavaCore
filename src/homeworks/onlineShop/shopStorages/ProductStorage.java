package homeworks.onlineShop.shopStorages;

import homeworks.onlineShop.components.Product;
import homeworks.onlineShop.components.User;

public class ProductStorage {

    private Product[] products = new Product[10];
    private int size;

    public void addProduct(Product product) {
        if (products.length == size) {
            extand();
        }
        products[size++] = product;
    }

    public void extand() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, size);
        products = tmp;
    }

    public void printAllProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public Product getProductById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        return null;
    }

    public int getIndexProductById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void removeProductById(String id) {
        int index = getIndexProductById(id);

        for (int i = index + 1; i < size; i++) {
            products[i - 1] = products[i];
        }

        size--;
    }
}
