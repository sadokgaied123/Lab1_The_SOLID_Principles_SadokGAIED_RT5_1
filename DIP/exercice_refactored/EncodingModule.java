package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private IDataReader reader;
    private IDataWriter writer;

    public EncodingModule(IDataReader reader, IDataWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() throws IOException {
        String inputString = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        writer.write(encodedString);
    }
}
