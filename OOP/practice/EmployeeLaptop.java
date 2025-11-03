package OOP.practice;

public class EmployeeLaptop implements Device {
    private final String brand;
    private final String model;
    private final Employee assignedTo;

    public EmployeeLaptop(String brand, String model, Employee assignedTo) {
        this.brand = brand;
        this.model = model;
        this.assignedTo = assignedTo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Employee getAssignedTo() {
        return assignedTo;
    }

    @Override
    public void turnOn(String when) {
        System.out.println(brand + " " + model + " (used by " +
                assignedTo.getFullName() + ") turned on at: " + when);
    }

    @Override
    public void turnOff(String when) {
        System.out.println(brand + " " + model + " (used by " +
                assignedTo.getFullName() + ") turned off at: " + when);
    }
}
