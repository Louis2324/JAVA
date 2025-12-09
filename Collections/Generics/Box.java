package Collections.Generics;

import java.util.Comparator;

public class Box<T extends Comparable<T>> {
    private T value;

    public Box(T val) {
        this.value = val;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{value='" + value + "'}";
    }

    public class BoxComparator implements Comparator<Box<T>> {
        @Override
        public int compare(Box<T> box1, Box<T> box2) {
            return box1.getValue().compareTo(box2.getValue());
        }
    }

    public static Comparator<Box<Integer>> getReverseComparator() {
        return new Comparator<Box<Integer>>() {
            @Override
            public int compare(Box<Integer> b1, Box<Integer> b2) {
                return b2.getValue().compareTo(b1.getValue());
            }
        };
    }


    public BoxComparator getComparator() {
        return new BoxComparator();
    }
}