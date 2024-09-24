package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {

 public static List<Integer> getValues(HashMap<Integer, Integer> map) {
     List<Integer> valuesList = new ArrayList<>(map.values());

     Collections.sort(valuesList);

     return valuesList;
 }

 public static void main(String[] args) {
     HashMap<Integer, Integer> hashMap = new HashMap<>();
     hashMap.put(101, 450);
     hashMap.put(102, 300);
     hashMap.put(103, 600);
     hashMap.put(104, 200);
     
     // Get and display sorted values from the map
     List<Integer> sortedValues = getValues(hashMap);
     System.out.println("Sorted Values: " + sortedValues);
 }
}
