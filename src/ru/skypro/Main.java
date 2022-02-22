package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author authorLordOfRings = new Author("John", "Tolkien");
        Book lordOfTheRings = new Book("Lord of the rings", authorLordOfRings, 1954);
        System.out.println(lordOfTheRings.getBookName() + ", " + authorLordOfRings.getFirstName() + " " + authorLordOfRings.getLastName() + ", " + lordOfTheRings.getPublicationYear());
        Author authorHarryPotter = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", authorHarryPotter, 1997);
        System.out.println(harryPotter.getBookName() + ", " + authorHarryPotter.getFirstName() + " " + authorHarryPotter.getLastName() + ", " + harryPotter.getPublicationYear());
        harryPotter.setPublicationYear(2007);
        System.out.println(harryPotter.getBookName() + ", " + authorHarryPotter.getFirstName() + " " + authorHarryPotter.getLastName() + ", " + harryPotter.getPublicationYear());
    }
}
