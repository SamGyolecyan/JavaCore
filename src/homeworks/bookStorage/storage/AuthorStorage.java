package homeworks.bookStorage.storage;

import homeworks.bookStorage.model.Author;
import homeworks.bookStorage.model.Book;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size;

    public void add(Author author) {
        if (authors.length == size) {
            extandStorage();
        }
        authors[size++] = author;
    }

    private void extandStorage() {
        Author[] tmp = new Author[size + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public Author getAuthorById(String id) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getId().equals(id)) {
                return authors[i];
            }
        }
        return null;
    }

    public void deleteAuthorById(String id) {
        int index = getAuthorIndexById(id);
        for (int i = index + 1; i < size; i++) {
            authors[i - 1] = authors[i];
        }

        size--;

    }

    private int getAuthorIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }


}
