public class SelectionSort {

    public static void SelectionSorting(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 3, 7, 9, 12, 10, 6 };

        // Call bubbleSort to sort the array
        SelectionSorting(arr);

        // Print the sorted array
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
