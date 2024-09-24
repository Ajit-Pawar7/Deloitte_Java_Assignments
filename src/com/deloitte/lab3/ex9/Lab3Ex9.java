package com.deloitte.lab3.ex9;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Lab3Ex9 {

    public static void calculateDuration(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate inputDate = LocalDate.parse(dateString, formatter);
            LocalDate currentDate = LocalDate.now();

            Period period = Period.between(inputDate, currentDate);
            System.out.println("Duration from " + inputDate + " to " + currentDate + ":");
            System.out.println("Years: " + period.getYears());
            System.out.println("Months: " + period.getMonths());
            System.out.println("Days: " + period.getDays());

        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }

    public static void main(String[] args) {
        String dateString = "2020-01-01";
        calculateDuration(dateString);
    }
}
