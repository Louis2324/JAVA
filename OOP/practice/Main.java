package OOP.practice;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Louis", 27, 101, "Software Engineer", "IT");
        EmployeeLaptop laptop = new EmployeeLaptop("Dell", "Latitude 5420", emp);

        System.out.println(emp.toString());
        laptop.turnOn(LocalTime.now().toString());
        laptop.turnOff(LocalTime.now().toString());
    }
}
