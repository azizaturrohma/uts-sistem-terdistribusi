package ObjectSerialization;

import java.io.Serializable;

public class Student implements Serializable { // Class ini mengimplementasikan interface Serializable
    // Properti, atribut
    private final String nim;
    private final String name;
    private final String gender;
    private final String phoneNumber;

    // Method with 3 params, this merujuk pada properti/atribut dari class
    public Student(String nim, String name, String gender, String phoneNumber) {
        this.nim = nim;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "[" + nim + ", " + name + ", " + gender + ", " + phoneNumber + "], ";
    }
}
