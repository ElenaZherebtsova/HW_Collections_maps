import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1:");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 2, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.printf(num + " ");
            }
        }
        System.out.println();


        System.out.println("Задача 2:");
        Collections.sort(nums);
        int firstNum = Integer.MIN_VALUE;
        for (int n:
             nums) {
            if (n % 2 == 0 && n != firstNum) {
                System.out.printf(n + " ");
                firstNum = n;
            }
        }

        System.out.println();
        System.out.println("Задача 3:");

        Set<String> oneWords = new HashSet<>(strings);
        System.out.println(oneWords);

        System.out.println();
        System.out.println("Задача 4:");
        Set<String> newWords = new HashSet<>(strings);
        System.out.println(strings.size() - newWords.size());

    }
}