package I_O.SerializationDeserialization;

import java.io.*;


class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Version ID

    private String name;
    private int age;
    private String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        String filename = "person.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            Person person = new Person("Alice", 25, "secret123");
            out.writeObject(person);
            System.out.println("Saved: " + person);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person loadedPerson = (Person) in.readObject();
            System.out.println("Loaded: " + loadedPerson);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}