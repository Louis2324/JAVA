package OOP.classes;

public class Concrete {

    String name; //data member

    Concrete() {} //default constructor

    Concrete(String nm) {
        if(nm.trim().isEmpty()) {
            this.name = "John Doe";
            return;
        }
        this.name = nm.trim();
    }
    //parameterized constructor

   public void greet() {
        System.out.println("Hello I am " + this.name);
    }//public method

}
