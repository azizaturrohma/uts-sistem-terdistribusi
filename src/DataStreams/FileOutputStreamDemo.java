package DataStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);

        String destination = "src/DataStreams/file/2B.txt"; // letak destinasi file
        OutputStream output = new FileOutputStream(destination, true); // valuenya true karena agar teks sebelumnya
                                                                       // tetap ada (tidak ditimpa)

        System.out.print("Masukkan jumlah mahasiswa yang ingin Anda inputkan: ");
        int quantity = input.nextInt();
        input.nextLine();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Masukkan nama panggilan mahasiswa ke-" + (i + 1));
            String nickName = input.nextLine();

            output.write(nickName.getBytes()); // Menulis nama panggilan dari input pengguna ke dalam file
            output.write(System.lineSeparator().getBytes()); // Menulis baris baru, agar teks input selanjutnya akan
                                                             // berada di bawahnya bukan di sampingnya
        }

        // Close write to file
        output.close();

        // Close scanner input
        input.close();

        System.out.println("Berhasil menambahkan data mahasiswa ke dalam file " + destination);
    }
}