public class SortArray {

    // Recursive method to check if the array is sorted
    public static boolean isSorted(int[] arr, int i) {
        // Base case: reached the last element, array is sorted
        if (i == arr.length - 1) {
            return true;
        }
        // If the current element is greater than the next, array is not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        // Recursive call to check the next element
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println(isSorted(arr, 0));  // Should print true if sorted
    }
}
