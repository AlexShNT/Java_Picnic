package main;

import java.util.ArrayList;
import java.util.HashMap;

public class WordFrequency {
    private ArrayList<String> arrayList;
    private final HashMap<String, Integer> wordFrequency = new HashMap<>();
    public WordFrequency(ArrayList<String> arrayList) {
        for (String word: arrayList) {
            word = word.toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
    }

    public HashMap<String, Integer> getWordFrequency(){
        return wordFrequency;
    }

    @Override
    public String toString() {
        StringBuilder words = new StringBuilder();
        for (String key : wordFrequency.keySet()) {
            words.append(String.format("%s: %d\n", key, wordFrequency.get(key)));
        }
        return words.toString();
    }
}
