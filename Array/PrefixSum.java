//import java.util.Scanner;

public class PrefixSum {
    public static int makeprefixSumArray(int arr[]) {
        int n = arr.length;
        // int[] prefix = new int[n];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            res = res + arr[i];
        }
        return res;
    }

    public static int makesuffixSumArray(int arr[]) {
        int n = arr.length;
        // int[] prefix = new int[n];
        int res = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            res = res + arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };

        System.out.println(makeprefixSumArray(arr));
        System.out.println(makesuffixSumArray(arr));
    }

}
