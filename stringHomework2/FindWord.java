package stringHomework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindWord {
    final int MIN_NUMBER_OF_LETTERS_IN_WORD = 3;  // The minimum number of letters in a word
    private HashMap<String, Integer> words = new HashMap<>();
    private Scanner readFile;
    public FindWord(Scanner readFile) {
        this.readFile = readFile;
    }
    public void reader() {
        while (readFile.hasNext()) {
            String word = readFile.next().replaceAll("[^а-яёА-ЯЁ]", "");
            if (words.containsKey(word)) {
                int valueInt = words.get(word) + 1;
                words.put(word, valueInt);
            } else {
                words.put(word, 1);
            }
        }
    }
    public String longWords() {
        String longWord = "";

        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (entryKey.length() >= MIN_NUMBER_OF_LETTERS_IN_WORD && longWord.length() <= entryKey.length()) {
                if (longWord.length() == entryKey.length()) {
                    if (longWord.compareTo(entryKey) <= 0) {
                        longWord = entryKey;
                    }
                } else {
                    longWord = entryKey.toString();
                }
            }
        }
        return longWord;
    }
    public String shortWords() {
        String shortWord = longWords();
        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (entryKey.length() >= MIN_NUMBER_OF_LETTERS_IN_WORD && shortWord.length() >= entryKey.length()) {
                if (shortWord.length() == entryKey.length()) {
                    if (shortWord.compareTo(entryKey) >= 0) {
                        shortWord = entryKey;
                    }
                } else {
                    shortWord = entryKey.toString();
                }
            }
        }
        return shortWord;
    }
    public Integer getValueHashMap(String string) {
        return words.get(string);
    }
}