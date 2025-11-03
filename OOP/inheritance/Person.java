package OOP.inheritance;

public class Person {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.trim().isEmpty()) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name , int age) {
        setName(name);
        setAge(age);
    }
    public void setAge(int age) {
        if(age < 0 ) return;
        this.age = age;
    }

    @Override
    public String  toString() {
        return "Hello I am " + name +  ", and I am " + age + " years old." ;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ) return false;
        Person p  = (Person) obj;
        return  p.age == this.age && this.name.equals(p.name);
    }
}
