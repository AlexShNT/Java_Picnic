package main;

import java.util.ArrayList;

public class LongestWord {
    private ArrayList<String> arrayList;
    public LongestWord(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public String getLongestWord() {
        String word = "";
        for (String tmpWord: this.arrayList) {
            if (word.length() < tmpWord.length()){
                word = tmpWord;
            }
        }

        return word;
    }
}
