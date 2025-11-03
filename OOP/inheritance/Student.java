package OOP.inheritance;

public class Student extends Person {

    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        setName(name);
        setAge(age);
        this.studentId = studentId;
    }


    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty!");
        }
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        if (age < 15) {
            throw new IllegalArgumentException("Student must be at least 15 years old!");
        }
        super.setAge(age);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
