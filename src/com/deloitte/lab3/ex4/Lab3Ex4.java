package com.deloitte.lab3.ex4;
public class Lab3Ex4 {
    public static int modifyNumber(int number) {
        String numStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            if (i == numStr.length() - 1) {
                result.append(numStr.charAt(i));
            } else {
                int currentDigit = Character.getNumericValue(numStr.charAt(i));//calcn sathi
                int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));
                
                int difference = Math.abs(currentDigit - nextDigit);
                result.append(difference);
            }
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        int number = 45862;      
        int result = modifyNumber(number);
        System.out.println("Output: " + result);
    }
}
