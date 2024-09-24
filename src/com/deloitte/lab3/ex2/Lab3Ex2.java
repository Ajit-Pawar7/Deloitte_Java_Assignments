package com.deloitte.lab3.ex2;
public class Lab3Ex2 {

    public static String getImage(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
                String mirrorImage = stringBuffer.reverse().toString();
                return input + "|" + mirrorImage;
    }

    public static void main(String[] args) {
        String input = "EARTH"; 
        String result = getImage(input);
        System.out.println("Output: " + result);
    }
}
