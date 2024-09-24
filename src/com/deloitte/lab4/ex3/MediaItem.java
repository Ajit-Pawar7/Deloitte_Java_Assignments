package com.deloitte.lab4.ex3;
public abstract class MediaItem extends Item {
    private int runtime; // in minutes

    public MediaItem(int id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "MediaItem [ID: " + getId() + ", Title: " + getTitle() + ", Runtime: " + runtime +
               " mins, Copies: " + getNumberOfCopies() + "]";
    }
}

