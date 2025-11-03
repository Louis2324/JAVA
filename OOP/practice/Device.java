package OOP.practice;
public interface Device {
    default void turnOn(String when) {
        System.out.println("Device turned on at: " + when);
    }

    default void turnOff(String when) {
        System.out.println("Device turned off at: " + when);
    }
}

