package com.deloitte.lab4.ex3;

public abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "WrittenItem [ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author +
               ", Copies: " + getNumberOfCopies() + "]";
    }
}
