public class LinearSearch {
    public static int recurrenceLinearSearch(int[] arr, int key, int i) {
        // base case
        if (i == arr.length - 1) {
            return -1;
        }
        // if index found
        if (arr[i] == key) {
            return i;
        }
        // recurrence condition
        return recurrenceLinearSearch(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 18, 9 };
        int key = 18;
        System.out.println(recurrenceLinearSearch(arr, key, 0));
    }
}
