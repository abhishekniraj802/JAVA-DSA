//import java.util.*;

public class Subarrays {
    public static void printSubarrays(int numbers[]) {
        // Iterate over all possible starting points of subarrays
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // Iterate over all possible ending points of subarrays
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " "); // Print each element in the subarray
                }
                ts++;
                System.out.println(); // Newline after each subarray
            }
            System.out.println(); // Newline between different start points
        }
        System.out.println("total subarrays = " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers); // Call the function to print all subarrays
    }
}
