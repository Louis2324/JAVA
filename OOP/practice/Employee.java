package OOP.practice;

public class Employee extends Person {
    private double employeeId;
    private String role;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }

    public Employee() {
        super();
    }

    public Employee(String fullName , int age , double employeeId, String role , String department) {
        super(fullName , age);
        setEmployeeId(employeeId);
        setRole(role);
        setDepartment(department);
    }


}
