public class BubbleSort {

    // Static method to swap two elements in the array
    // public static void swap(int arr[], int i, int j) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }

    // Bubble Sort algorithm
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // Correct loop bounds
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 3, 7, 9, 12, 10, 6 };

        // Call bubbleSort to sort the array
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
