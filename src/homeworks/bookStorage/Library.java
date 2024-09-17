package homeworks.bookStorage;

import homeworks.bookStorage.comments.Commands;
import homeworks.bookStorage.model.Author;
import homeworks.bookStorage.model.Book;
import homeworks.bookStorage.storage.AuthorStorage;
import homeworks.bookStorage.storage.BookStorage;

import java.util.Scanner;

public class Library implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    searchBookByTitle();
                    break;
                case UPDATE_BOOKS:
                    updateBook();
                    break;
                case SEARCH_BOOK_BY_PRICE:
                    searchBookByPrice();
                    break;
                case DELETE_BOOK_BY_ID:
                    deleteBookById();
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                default:
                    System.out.println("Wrong command!!");
            }

        }
    }

    private static void searchBookByAuthor() {
        authorStorage.print();
        System.out.println("Please, choose author ID");
        String authorId = scanner.nextLine();
        Author author = authorStorage.getAuthorById(authorId);
        bookStorage.searchBookByAuthor(author);
    }

    private static void addAuthor() {
        authorStorage.print();
        System.out.println("Please, input id, name, surname, phone, age");
        String authorData = scanner.nextLine();
        String[] authorDataArr = authorData.split(",");

        if (authorDataArr.length == 5) {
            String id = authorDataArr[0];
            Author author = new Author();
            if (authorStorage.getAuthorById(id) == null) {
                author.setId(id);
                author.setName(authorDataArr[1]);
                author.setSurname(authorDataArr[2]);
                author.setPhone(authorDataArr[3]);
                author.setAge(Integer.parseInt(authorDataArr[4]));
                authorStorage.add(author);
                System.out.println("Author added!!");
            } else {
                System.out.println("Author with id " + id + "already exists!");
            }
        }

    }

    private static void deleteBookById() {
        System.out.println("Please, input book ID");
        String bookId = scanner.nextLine();
        bookStorage.deleteBookById(bookId);
        if (bookId != null && !bookId.isEmpty()) {
            System.out.println("The book with ID " + bookId + " was delete!!");
        }
    }

    private static void searchBookByPrice() {
        System.out.println("Please, input book prices:");
        try {
            double priceFirst = Double.parseDouble(scanner.nextLine());
            double priceSecond = Double.parseDouble(scanner.nextLine());
            bookStorage.searchBookByPrice(priceFirst, priceSecond);
        } catch (NumberFormatException e) {
            System.out.println("Please, input only digits");
        }
    }

    private static void updateBook() {
        bookStorage.print();
        System.out.println("Please, input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookById(bookId);

        if (bookById != null) {
            authorStorage.print();
            System.out.println("Please, choose author ID");
            String authorId = scanner.nextLine();
            Author author = authorStorage.getAuthorById(authorId);
            System.out.println("Please, input book's new title:");
            String title = scanner.nextLine();
            System.out.println("Please, input book's new price:");
            String priceStr = scanner.nextLine();
            System.out.println("Please, input book's new quality:");
            String qualityStr = scanner.nextLine();

            if (title != null && !title.isEmpty()) {
                bookById.setTitle(title);
            }
            bookById.setAuthor(author);
            if (priceStr != null && !priceStr.isEmpty()) {
                bookById.setPrice(Double.parseDouble(priceStr));
            }
            if (qualityStr != null && !qualityStr.isEmpty()) {
                bookById.setQuality(Integer.parseInt(qualityStr));
            }

            System.out.println("Update was successfully!!");
        }

    }

    private static void searchBookByTitle() {
        System.out.println("Please, input book keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBookByTitle(keyword);
    }

    private static void addBook() {
        authorStorage.print();
        System.out.println("Please, choose author ID");
        String authorId = scanner.nextLine();
        Author author = authorStorage.getAuthorById(authorId);

        if (author != null) {
            System.out.println("Please, input book ID:");
            String id = scanner.nextLine();
            System.out.println("Please, input book title:");
            String title = scanner.nextLine();
            double price = 0;
            try {
                price = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please, input only digits");
            }
            System.out.println("Please, input book quality:");
            int quality = 0;
            try {
                quality = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please, input only digits");
            }
            Book book = new Book(id, title, author, price, quality);
            Book bookById = bookStorage.getBookById(id);
            if (bookById == null) {
                bookStorage.add(book);
                System.out.println("Book added!!");
                System.out.println();
            } else {
                System.out.println("Book with " + id + " already exists!!");
            }
        } else {
            System.out.println("Wrong author id!!");
        }

    }

}
