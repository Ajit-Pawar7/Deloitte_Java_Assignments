package com.deloitte.lab4.ex3;
public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void printDetails() {
        System.out.println("JournalPaper Details: " + this.toString() + ", Year Published: " + yearPublished);
    }
}
