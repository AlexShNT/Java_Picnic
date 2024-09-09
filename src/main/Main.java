package main;

public class Main {
    public static void main(String[] args) {
        FileReaderClass fileReaderClass = new FileReaderClass("input.txt");

        int wordCount = 0;
        for (String tmpStr: fileReaderClass.getFileContent()) {
            wordCount ++;
        }
        System.out.println("Количество слов в файле: " + wordCount);

        LongestWord longestWord = new LongestWord(fileReaderClass.getFileContent());
        System.out.println("Самое длинное слово в файле: " + longestWord.getLongestWord());

        WordFrequency wordFrequency =new WordFrequency(fileReaderClass.getFileContent());
        System.out.println("Количество слов в файле: " + wordFrequency.getWordFrequency());
        System.out.println("Количество слов в файле(списком): " + wordFrequency.toString());

    }
}