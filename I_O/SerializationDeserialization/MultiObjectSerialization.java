package I_O.SerializationDeserialization;

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 2L;
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class MultiObjectSerialization {
    public static void main(String[] args) {
        String filename = "students.dat";

        Student[] students = {
                new Student("Bob", 3.5),
                new Student("Charlie", 3.8),
                new Student("Diana", 4.0)
        };

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(filename))) {

            out.writeObject(students);
            System.out.println("Saved " + students.length + " students");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(filename))) {

            Student[] loadedStudents = (Student[]) in.readObject();
            System.out.println("Loaded students:");
            for (Student s : loadedStudents) {
                System.out.println("  " + s.name + ": " + s.gpa);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}