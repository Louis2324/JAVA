package OOP.practice;

public class Person {
    private String fullName;
    private int age;

    public void setFullName(String fullNm) {
        if(fullNm.trim().isEmpty()){
            System.out.println("Name can't be empty");
            return;
        }
        this.fullName = fullNm;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setAge(int ag) {
        if(ag < 0 ) {
            System.out.println("Age can't be negative");
            return;
        }
        this.age = ag;
    }

    public int getAge() {
        return this.age;
    }

    public Person() {}
    public Person(String fullName , int age ) {
     setFullName(fullName);
     setAge(age);
    }

    @Override
    public String toString() {
        return "Person {" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}
