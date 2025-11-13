package Collections.Set;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        System.out.println(nums);

    }
}
