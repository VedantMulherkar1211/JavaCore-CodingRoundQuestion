/*
 if a girl has N number of options to eat but she has to maintain her calories to zero 
 where calories is represented by C(i) whereas mainintaining calories means the 
 number of ways that is i she has to eat when she eat C(i) = 0 means all calories is zero.
 Example 1 
 input 
 N=4 
 i=1,i=-1,i=1,i=-1 
 
 output: 4. 
 
 Example 2 
 input 
 N=2 
 i=0,i=0 
 
 output: 1
 */
import java.util.*;

public class CountZeroCaloriesWays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int N = scanner.nextInt();

        int[] calories = new int[N];
        System.out.println("Enter the calories of each item:");
        for (int i = 0; i < N; i++) {
            calories[i] = scanner.nextInt();
        }

        int count = findZeroCaloriesWays(calories);
        System.out.println("Number of ways to choose items with zero total calories: " + count);
    }

    private static int findZeroCaloriesWays(int[] calories) {
        int count = 0;

        // Calculate the sum of all possible subsets
        int sum = 0;
        for (int calorie : calories) {
            sum += calorie;
        }

        // If the total sum is zero, it means there is one way to choose an empty subset
        if (sum == 0) {
            count++;
        }

        // Generate all possible subsets using binary representation
        int totalSubsets = 1 << calories.length;
        for (int i = 1; i < totalSubsets; i++) {
            int subsetSum = 0;
            for (int j = 0; j < calories.length; j++) {
                if ((i & (1 << j)) != 0) {
                    subsetSum += calories[j];
                }
            }

            // If the subset sum is zero, increment the count
            if (subsetSum == 0) {
                count++;
            }
        }

        return count;
    }
}
