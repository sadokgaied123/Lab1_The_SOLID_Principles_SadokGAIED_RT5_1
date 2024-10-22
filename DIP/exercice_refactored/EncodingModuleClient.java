package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Use case 1: Encoding from file to file
        IDataReader fileReader = new FileReaderModule("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataWriter fileWriter = new FileWriterModule("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule encodingModule1 = new EncodingModule(fileReader, fileWriter);
        encodingModule1.encode();

        // Use case 2: Encoding from network to database
        IDataReader networkReader = new NetworkReaderModule("http://myfirstappwith.appspot.com/index.html");
        IDataWriter databaseWriter = new MyDatabase();
        EncodingModule encodingModule2 = new EncodingModule(networkReader, databaseWriter);
        encodingModule2.encode();
    }
}
