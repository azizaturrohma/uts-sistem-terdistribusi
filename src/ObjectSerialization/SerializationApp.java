package ObjectSerialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializationApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        System.out.print("Masukkan jumlah data yang ingin Anda masukkan: ");
        int quantity = input.nextInt();

        // For loop untuk melooping sebanyak jumlah mahasiswa
        for (int i = 1; i <= quantity; i++) {
            System.out.println("----------------------------------------------");
            System.out.println("Masukkan data mahasiswa ke-" + i);

            System.out.print("Masukkan NIM: ");
            String nim = input.next();

            System.out.print("Masukkan Nama: ");
            String name = input.next();

            System.out.print("Masukkan Jenis Kelamin: ");
            String gender = input.next();

            System.out.print("Masukkan Nomor Telepon: ");
            String phoneNumber = input.next();

            // Menambahkan data ke Array List
            students.add(new Student(nim, name, gender, phoneNumber));

        }

        input.close();

        System.out.println("----------------------------------------------");
        System.out.println("Students: " + students);

        // Membuat objek dari class SerializationDemo
        SerializationDemo demo = new SerializationDemo();

        demo.serialize(students, "src/ObjectSerialization/file/NIM.ser");
        System.out.println("Serialization is done");

        System.out.println("Deserialize object...");
        List<Student> newList = demo.deserialize("src/ObjectSerialization/file/NIM.ser");

        System.out.println("New List Student: " + newList);
    }
}