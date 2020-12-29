package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MockDict implements Dictionary{

    Set<String> Dict;

    public MockDict() {
        Dict = new HashSet<String>();
        readWords();
    }

    //check whether a word in Dictionary
    public boolean isEnglishWord(String word){
        return Dict.contains(word.toUpperCase());
    }

    //load all word in Dictionary.txt into MockDict.Dict
    private void readWords() {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("src/main/resources/Dictionary.txt"));
            String word = reader.readLine();
            while(word != null) {
                Dict.add(word);
                word = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
