package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderModule implements IDataReader {
    private String filePath;

    public FileReaderModule(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                result.append(aLine).append("\n");
            }
        }
        return result.toString();
    }
}
