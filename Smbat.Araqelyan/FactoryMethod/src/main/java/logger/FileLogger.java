package logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    public void log(String message) {
        try
        {
            File file = new File("Filelog.log");
            FileWriter fileWriter = new FileWriter(file.getName(), true);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(message);
            bufferWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("Message logged in file: " + message);
    }
}
