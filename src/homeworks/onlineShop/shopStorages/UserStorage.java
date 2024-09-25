package homeworks.onlineShop.shopStorages;

import homeworks.onlineShop.components.User;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void addUser(User user) {
        if (users.length == size) {
            extand();
        }
        users[size++] = user;
    }

    public void extand() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, size);
        users = tmp;
    }

    public void printAllUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getUserById(String id) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(id)) {
                return users[i];
            }
        }
        return null;
    }
}
