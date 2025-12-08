package Enum.Start;

public class Main {
   public static void main (String[] args) {
       Days day = Days.MONDAY;
       String dayName = day.name();

       System.out.println(dayName);
       System.out.println(day);
   }
}
