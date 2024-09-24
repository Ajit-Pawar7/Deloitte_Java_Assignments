package com.deloitte.lab4.ex3;

public class LibraryClient {

    public static void main(String[] args) {
        // Create some items
        Book book = new Book(1, "Java Programming", 5, "Herbert Schildt");
        JournalPaper journal = new JournalPaper(2, "AI Research", 3, "John Doe", 2021);
        Video video = new Video(3, "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD(4, "Greatest Hits", 10, 60, "Queen", "Rock");

        book.printDetails();
        journal.printDetails();
        video.printDetails();
        cd.printDetails();

        book.checkOut();
        cd.addItem(5);
    }
}
