package OOP.classes;

public class NestedStatic {
   static int data = 10;

    static class Inner  {
        void display() {
            System.out.println("Data: " + data);
        }
    }

}
