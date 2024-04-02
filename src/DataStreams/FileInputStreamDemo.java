package DataStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Create an input stream and read from specified file
        InputStream file = new FileInputStream("src/DataStreams/file/2B.txt");

        // Read the first byte of data
        int data = file.read();

        // Repeat: until end of file reached
        while (data != -1) { // -1 sbg penanda akhir file dlm Java (gada karakter yang bisa dibaca lagi)

            // Convert byte to char and send it to standart output
            System.out.print((char) data);

            // Read next byte
            data = file.read();
        }

        // Close the file input stream
        file.close();
    }
}