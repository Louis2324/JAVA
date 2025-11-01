package intro;
import java.util.ArrayList;
import java.util.Arrays;
public class Equality {

    public static void main (String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,3,4,5};
        System.out.println(nums1 == nums2);
        System.out.println(nums1.equals(nums2));
        System.out.println(Arrays.equals(nums1 , nums2));

    }
}
