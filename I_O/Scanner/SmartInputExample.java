package I_O.Scanner;

import java.io.*;
import java.util.*;


public class SmartInputExample {
    public static void main(String[] args) throws IOException {

        // Example 1: Reading from console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: $");
        double salary = scanner.nextDouble();

        scanner.nextLine(); // Clear buffer

        System.out.print("Are you employed? (true/false): ");
        boolean employed = scanner.nextBoolean();

        System.out.println("\nSummary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Employed: " + employed);

        // Example 2: Reading from file with parsing
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File("dest.txt"));

            // Set delimiter to comma with optional spaces
            fileScanner.useDelimiter(",\\s*");

            System.out.println("\nReading from file:");
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    System.out.println("Number: " + fileScanner.nextInt());
                } else if (fileScanner.hasNextDouble()) {
                    System.out.println("Decimal: " + fileScanner.nextDouble());
                } else {
                    System.out.println("Text: " + fileScanner.next());
                }
            }

        } finally {
            if (fileScanner != null) fileScanner.close();
            scanner.close();
        }
    }
}