package com.deloitte.lab3.ex5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab3Ex5 {

    public static void analyzeText(String filePath) {
        int characterCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++; 
                characterCount += line.length();

                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of characters: " + characterCount);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "sample.txt"; 
        analyzeText(filePath);
    }
}
