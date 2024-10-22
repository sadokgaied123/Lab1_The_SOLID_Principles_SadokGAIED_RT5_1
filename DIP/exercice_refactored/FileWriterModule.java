package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterModule implements IDataWriter {
    private String filePath;

    public FileWriterModule(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
