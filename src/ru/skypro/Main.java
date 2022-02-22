package ru.skypro;

public class Main {
    public static void printDataBook(String bookName, String authorFirstName, String authorLastName, int publicationYear) {
        System.out.println(bookName + ", " + authorFirstName + " " + authorLastName + ", " + publicationYear);
        return;
    }

    public static void main(String[] args) {
        Author authorLordOfRings = new Author("John", "Tolkien");
        Book lordOfTheRings = new Book("Lord of the rings", authorLordOfRings, 1954);
        printDataBook(lordOfTheRings.getBookName(), authorLordOfRings.getFirstName(), authorLordOfRings.getLastName(), lordOfTheRings.getPublicationYear());

        Author authorHarryPotter = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", authorHarryPotter, 1997);
        printDataBook(harryPotter.getBookName(), authorHarryPotter.getFirstName(), authorHarryPotter.getLastName(), harryPotter.getPublicationYear());

        harryPotter.setPublicationYear(2007);
        printDataBook(harryPotter.getBookName(), authorHarryPotter.getFirstName(), authorHarryPotter.getLastName(), harryPotter.getPublicationYear());

    }
}
