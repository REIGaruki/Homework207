import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(4, 8, 15, 16, 23, 42, 37, 23, 57, 4, 9, 3, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("Task 2");
        for (int i = Collections.min(nums); i <= Collections.max(nums);) {
            if (nums.contains(i) && i % 2 == 0) {
                System.out.println(i);
                i+= 2;
            } else {
                i++;
            }
        }
    }
}