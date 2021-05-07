package stringHomework;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String strings = "Hello my name i$$$s Ja@@@va. Collection?2422 comparator, For is/ && !! world 232324";
        StringAnalyzer stringAnalyzer = new StringAnalyzer(strings);
        stringAnalyzer.analyzer();
        stringAnalyzer.display();
    }


}
