package Collections.Generics;

import java.util.Objects;

public class Student<T extends Comparable<T>, U extends Number, V>
        implements Comparable<Student<T, U, V>> {
    private T name;
    private U age;
    private V gender;

    public Student(T nm, U a, V gd) {
        this.name = nm;
        this.age = a;
        this.gender = gd;
    }

    public T getName() {
        return name;
    }

    public U getAge() {
        return age;
    }

    public V getGender() {
        return gender;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student<?, ?, ?> student = (Student<?, ?, ?>) obj;

        return Objects.equals(name, student.getName()) &&
                Objects.equals(age, student.getAge()) &&
                Objects.equals(gender, student.getGender());

    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }


    @Override
    public int compareTo(Student<T, U, V> other) {
        int nameCompare = this.name.compareTo(other.getName());

        if (nameCompare != 0) return nameCompare;

        int ageCompare = Double.compare(this.age.doubleValue(), other.getAge().doubleValue());
        if (ageCompare != 0) return ageCompare;

        return this.gender.toString().compareTo(other.getGender().toString());
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }
}
