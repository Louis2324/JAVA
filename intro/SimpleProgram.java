package intro;

public class SimpleProgram {
    public static int maximum(int[] numbers) {
        if(numbers.length == 0) return -1;
        int max = numbers[0];
        for (int num : numbers) {
            if(num>max) {
                max = num;
            }
        }
     return max;
    }

    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50};

        int highest = maximum(marks);
        System.out.println(highest);
    }
}
