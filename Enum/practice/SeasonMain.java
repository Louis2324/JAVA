package Enum.practice;

public class SeasonMain {
    public static void main(String[] args) {

        for (Season s : Season.values()) {
            System.out.println(s.name().substring(0, 1).toUpperCase() + s.name().substring(1).toLowerCase() + " is " + s.getDescription());
        }
    }
}
