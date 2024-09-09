package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReaderClass {
    private String fileName;
    private ArrayList<String> fileContent;

    public FileReaderClass(String fileName) {
        this.fileName = fileName;
        this.fileContent = new ArrayList<>();
        readFile();
    }

    private void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] tmpArray = new String[0];
            while ((line = br.readLine()) != null) {
                tmpArray = line.split("\\s+");
            }
            for (String tmpString : tmpArray) {
                fileContent.add(tmpString);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public ArrayList<String> getFileContent() {
        return fileContent;
    }
}


