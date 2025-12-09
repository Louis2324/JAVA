package Collections.Generics;

import java.util.*;

public class GenericCollectionsDemo {
    public static void main(String[] args) {

        System.out.println("=== 1. DEMONSTRATING STUDENT CLASS (Comparable) ===\n");

        Student<String, Integer, String> s1 = new Student<>("Alice", 20, "Female");
        Student<String, Integer, String> s2 = new Student<>("Bob", 22, "Male");
        Student<String, Integer, String> s3 = new Student<>("Alice", 19, "Female");
        Student<String, Integer, String> s4 = new Student<>("Alice", 20, "Male");
        Student<String, Integer, String> s5 = new Student<>("Alice", 20, "Female");

        System.out.println("s1 equals s5? " + s1.equals(s5)); //Comparison by value
        System.out.println("s1 == s5? " + (s1 == s5)); // Demonstrating == vs equals  Comparison by Reference
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s5 hashCode: " + s5.hashCode() + " (should match s1)\n");

        List<Student<String, Integer, String>> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("Original list (unsorted):");
        studentList.forEach(System.out::println);

        Collections.sort(studentList);

        System.out.println("\nSorted list (by name → age → gender):");
        studentList.forEach(System.out::println);

        System.out.println("\n=== 2. DEMONSTRATING HASHING (HashSet) ===\n");

        Set<Student<String, Integer, String>> studentSet = new HashSet<>(studentList);
        System.out.println("HashSet size: " + studentSet.size() + " (duplicates removed)");
        System.out.println("HashSet contents:");
        studentSet.forEach(System.out::println);

        System.out.println("\n=== 3. DEMONSTRATING TREE SET (Sorted Set) ===\n");

        Set<Student<String, Integer, String>> treeSet = new TreeSet<>(studentList);
        System.out.println("TreeSet size: " + treeSet.size());
        System.out.println("TreeSet (automatically sorted):");
        treeSet.forEach(System.out::println);

        System.out.println("\n=== 4. DEMONSTRATING BOX CLASS (Comparator) ===\n");

        Box<Integer> box1 = new Box<>(10);
        Box<Integer> box2 = new Box<>(5);
        Box<Integer> box3 = new Box<>(20);
        Box<Integer> box4 = new Box<>(5);

        List<Box<Integer>> boxList = new ArrayList<>();
        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);
        boxList.add(box4);

        System.out.println("Original box list:");
        boxList.forEach(System.out::println);

        // FIXED: Create BoxComparator instance using factory method
        Box<Integer>.BoxComparator boxComparator = box1.getComparator();
        Collections.sort(boxList, boxComparator);

        System.out.println("\nSorted boxes (ascending by value):");
        boxList.forEach(System.out::println);

        // FIXED: Use static method correctly
        Collections.sort(boxList, Box.getReverseComparator());

        System.out.println("\nSorted boxes (descending by value):");
        boxList.forEach(System.out::println);

        System.out.println("\n=== 5. DEMONSTRATING WILDCARDS ===\n");

        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Sum of integers: " + sumNumbers(intList));
        System.out.println("Sum of doubles: " + sumNumbers(doubleList));

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println("Number list after adding: " + numberList);
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
    }
}