package stringHomework;

import java.util.HashMap;
import java.util.Map;

public class StringAnalyzer {
    private String strings;
    private int numberPunc;
    private int numberNumber;
    private int numberSpace;
    private final HashMap<Character, Integer> chars = new HashMap<>();

    public StringAnalyzer(String strings) {
        this.strings = strings;
    }

    public void analyzer() {
        String removePuncMarks = strings.replaceAll("\\p{Punct}", ""); //remove punctuation marks
        numberPunc = strings.length() - removePuncMarks.length();

        String removeNumber = removePuncMarks.replaceAll("[0-9]", "");   //remove number
        numberNumber = removePuncMarks.length() - removeNumber.length();

        String removeSpace = removeNumber.replaceAll(" ", "");   //remove space
        numberSpace = removeNumber.length() - removeSpace.length();

        String lowerCase = removeSpace.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            int counter = 0;
            for (int j = 0; j < lowerCase.length(); j++) {
                if (lowerCase.charAt(i) == lowerCase.charAt(j)) {
                    counter++;
                }
                chars.put(lowerCase.charAt(i), counter);
            }
        }
    }
    public void display() {
        for (Map.Entry entry : chars.entrySet()) {
            System.out.println("Char " + entry.getKey() + " - "
                    + entry.getValue());
        }
        System.out.println("Number of letter: " + strings.length());
        System.out.println("Number of space: " + numberSpace);
        System.out.println("Number of numbers: " + numberNumber);
        System.out.println("Number of punctuation marks: " + numberPunc);
    }
}