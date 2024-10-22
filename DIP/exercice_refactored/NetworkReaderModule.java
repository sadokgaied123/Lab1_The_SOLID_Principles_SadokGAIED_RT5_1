package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReaderModule implements IDataReader {
    private String urlString;

    public NetworkReaderModule(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            inputString.append((char) c);
        }
        return inputString.toString();
    }
}
