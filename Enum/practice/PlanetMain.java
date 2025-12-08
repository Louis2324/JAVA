package Enum.practice;

public class PlanetMain {

    public static void main(String[] args) {
        Planet use = Planet.EARTH;
        double earthWeight = 173;
        double mass = earthWeight / use.surfaceGravity();


        for (Planet p : Planet.values()) {
            System.out.println("Your weight on " + p.name() + " is: " + p.surfaceWeight(mass));
        }
    }

}
