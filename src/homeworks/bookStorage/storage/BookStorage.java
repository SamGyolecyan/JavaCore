package homeworks.bookStorage.storage;

import homeworks.bookStorage.model.Author;
import homeworks.bookStorage.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extandStorage();
        }
        books[size++] = book;
    }

    private void extandStorage() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBookByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookById(String id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                return books[i];
            }
        }
        return null;
    }

    public void searchBookByPrice(double firstNumber, double secondNumber) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= firstNumber && books[i].getPrice() <= secondNumber) {
                System.out.println(books[i]);
            }
        }
    }

    public void deleteBookById(String id) {
        int index = getBookIndexById(id);
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];
        }

        size--;

    }

    private int getBookIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }
        }
    }
}
