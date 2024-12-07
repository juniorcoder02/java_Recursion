public class BubbleSort {
   
    public static void recursiveBubbleSort(int[] arr, int n) {
        // Base case: if the array has 1 or fewer elements, it's already sorted
        if (n <= 1) {
            return;
        }
        
        // One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to the end.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // Recursive call on the reduced array
        recursiveBubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        // Start the recursive bubble sort
        recursiveBubbleSort(arr, arr.length);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
