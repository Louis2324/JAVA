package OOP.classes;

public class Main {
    public static void main(String[] args) {

        Concrete obj = new Concrete("");
        Concrete obj2 = new Concrete("Jane Doe");

        obj.greet();
        obj2.greet();

        Nested obj3 = new Nested();
        Nested.Inner obj4 = obj3.new Inner();
        obj4.show();

        NestedStatic.Inner obj5 = new NestedStatic.Inner();
        obj5.display();

    }
}
