package ObjectSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationDemo {
    public void serialize(List<Student> sList, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(sList);
        } catch (IOException ex) {
            System.out.println("A problem accured during serialization \n" + ex.getMessage());
        }
    }

    public List<Student> deserialize(String fileName) {
        List<Student> sList = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            sList = (List<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.printf("A problem accured deserializing %s%n", fileName);
            System.out.println(ex.getMessage());
        }

        return sList;
    }
}
