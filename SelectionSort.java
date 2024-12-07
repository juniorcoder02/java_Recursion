public class SelectionSort {
    public static void recursiveSelectionSort(int[] arr, int n) {
        if (n <= 1)
            return;
        int maxIndex = findMaxIndex(arr, n);
        swap(arr, n - 1, maxIndex);
        recursiveSelectionSort(arr, n - 1);
    }

    private static int findMaxIndex(int[] arr, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++)
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        return maxIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 8, 1 };
        recursiveSelectionSort(arr, arr.length);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
