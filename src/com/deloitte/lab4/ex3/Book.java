package com.deloitte.lab4.ex3;
public class Book extends WrittenItem {

    public Book(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void printDetails() {
        System.out.println("Book Details: " + this.toString());
    }
}
