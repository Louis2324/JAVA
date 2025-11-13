package Collections.Custom;
import java.util.*;

public class GamerSetDemo {
    public static void main(String[] args) {
        Set<Gamer> gamers = new TreeSet<>();

        gamers.add(new Gamer("Zigira", 91));
        gamers.add(new Gamer("Hinata", 90));
        gamers.add(new Gamer("Bakugou", 85));
        gamers.add(new Gamer("Zigira", 91)); // duplicate (same name and score)

        System.out.println(gamers);
    }
}

