import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("Task 2");
        for (int i = Collections.min(nums); i <= Collections.max(nums); i+= 1) {
            if (nums.contains(i) && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}