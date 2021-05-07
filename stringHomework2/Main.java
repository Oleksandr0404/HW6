package stringHomework2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        URL fileURL = new URL("https://drive.google.com/uc?export=download&confirm=no_antivirus&id=1xNjdaKxMvay5dzQ8rLxSmbh_SZqmuEy1");
        Scanner readFile = new Scanner(fileURL.openStream());
        FindWord findWord = new FindWord(readFile);
        findWord.reader();
        String shortWord = findWord.shortWords();
        String longWord = findWord.longWords();
        System.out.println("Short word: " + shortWord + ", number of word in the text: " + findWord.getValueHashMap(shortWord));
        System.out.println("Long word: " + longWord + ", number of word in the text: " + findWord.getValueHashMap(longWord));
    }
}
