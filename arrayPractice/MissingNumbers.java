package arrayPractice;
import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8};
        
        // Find and print missing numbers
        printMissingNumbers(arr);
    }

    public static void printMissingNumbers(int[] array) {
        // Find the minimum and maximum values in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // Create a boolean array to track presence of numbers
        boolean[] present = new boolean[max - min + 1];
        
        // Mark numbers present in the array
        for (int num : array) {
            present[num - min] = true;
        }
        
        // Print the missing numbers
        System.out.println("Missing numbers in the array are:");
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                System.out.println(i + min);
            }
        }
    }
}
