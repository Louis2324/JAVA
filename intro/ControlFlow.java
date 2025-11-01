package intro;

public class ControlFlow {

    public static void main(String[] args) {

     //conditionals
        //if
        int age = 18;
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }

        //switch
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of week");
                break;
            case "Friday":
                System.out.println("Weekend soon!");
                break;
            default:
                System.out.println("Midweek day");
                break;
        }
        //modern switch

        String mood =  switch (day) {
            case "Monday" -> "Tired";
            case "Friday" -> "Excited";
            default -> "Meh";
        };
        System.out.println(mood);

        //loops
          //while
            int count = 0;
            while (count < 3) {
                System.out.println("Count = " + count);
                count++;
            }
          //do-while
            int n = 5;
            do {
                System.out.println("n = " + n);
                n--;
            } while (n > 0);
         //for-each
            int[] nums = {1, 2, 3, 4, 5};

            for (int num : nums) {
                System.out.println(num);
            }

    }
}
