package Collections.List;
import java.util.ArrayList;

public class Example {
    public static void main (String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        System.out.println(names.size());

        names.add("Hinata");
        names.add("Bakugou");
        names.add("Louis");

        System.out.println(names.size());
        System.out.println(names);

        for(String name : names) {
            System.out.println(name);
        }

        names.remove("Louis");
        System.out.println(names.contains("Hinata"));
        System.out.println("Size: " + names.size());

        names.clear();
        System.out.println(names.isEmpty());
    }
}
