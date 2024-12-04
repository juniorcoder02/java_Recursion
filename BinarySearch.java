public class BinarySearch {
    public static int recurranceBinarySearch(int[] arr, int key, int start, int end) {
        // base case
        if (start > end) {
            return -1; // key not found in array
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return recurranceBinarySearch(arr, key, mid + 1, end);
        } else {
            return recurranceBinarySearch(arr, key, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 14, 21 };
        int key = 14;
        System.out.println(recurranceBinarySearch(arr, key, 0, arr.length - 1));
    }
}
