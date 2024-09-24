package com.deloitte.lab6.ex6;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Lab6Ex6 {

    public List<Integer> votersList(Map<Integer, LocalDate> people) {
        List<Integer> eligibleVoters = new ArrayList<>();
        
        //  Iterate through the map to check eligibility
        for (Map.Entry<Integer, LocalDate> entry : people.entrySet()) {
            int id = entry.getKey();
            LocalDate dob = entry.getValue();
            
            int age = Period.between(dob, LocalDate.now()).getYears();
            
            if (age > 18) {
                eligibleVoters.add(id);
            }
        }
                return eligibleVoters;
    }

    public static void main(String[] args) {
        Lab6Ex6 ve = new Lab6Ex6();
        
        Map<Integer, LocalDate> people = new HashMap<>();
        people.put(101, LocalDate.of(1990, 5, 15)); // Age: 34
        people.put(102, LocalDate.of(2005, 6, 22)); // Age: 19
        people.put(103, LocalDate.of(2010, 9, 13)); // Age: 14
        people.put(104, LocalDate.of(2002, 12, 1)); // Age: 21
        
        List<Integer> voters = ve.votersList(people);
        
        System.out.println("Eligible voters' IDs: " + voters);
    }
}
