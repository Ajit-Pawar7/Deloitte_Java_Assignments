package com.deloitte.lab4.ex3;

public abstract class Item {
    private int id;
    private String title;
    private int numberOfCopies;

    // Constructor
    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Methods for checking in, checking out, and adding items
    public void checkIn() {
        System.out.println(title + " checked in.");
    }

    public void checkOut() {
        System.out.println(title + " checked out.");
    }

    public void addItem(int count) {
        this.numberOfCopies += count;
        System.out.println(count + " copies added. Total: " + numberOfCopies);
    }

    // Abstract method to be implemented by subclasses
    public abstract void printDetails();
}
