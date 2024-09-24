package com.deloitte.lab6.ex3;
import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();

        for (int num : numbers) {
            squaresMap.put(num, num * num);
        }

        return squaresMap;
    }

    public static void main(String[] args) {
        int[] inputArray = { 2, 4, 6, 8, 10 };

        Map<Integer, Integer> result = getSquares(inputArray);

        System.out.println("Number and their squares: " + result);
    }
}
