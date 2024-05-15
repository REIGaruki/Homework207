import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
        System.out.println("Task 3");
        List<String> words = new ArrayList<>(List.of("напишите" , "код" , "который" , "выводит" , "в" ,
                "консоль" , "все" , "уникальные" , "слова" , "из" , "списка" , "слов" , "в" , "котором" , "могут" ,
                "встречаться" , "дубли" , "код" , "должен" , "работать" , "с" , "любой" , "последовательностью" ,
                "и" , "объемом" , "списка" , "слов"));
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String uniqueWord : uniqueWords) {
            System.out.print(uniqueWord + ' ');
        }
    }
}