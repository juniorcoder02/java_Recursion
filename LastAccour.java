public class LastAccour {

    /**
     * Recursive method to find the last occurrence of a key in an array.
     *
     * @param arr the array of integers to search in
     * @param key the target integer to find
     * @param i the current index in the array to check
     * @return the index of the last occurrence of the key, or -1 if the key is not found
     */
    public static int lastAccourance(int[] arr, int key, int i) {
        // Base case: If we reach the end of the array without finding the key
        if (i == arr.length) {
            return -1;
        }
        
        // Recursive call: move to the next index to find last occurrence
        int isFound = lastAccourance(arr, key, i + 1);
        
        // If key wasn't found in the rest of the array and current element matches the key
        if (isFound == -1 && arr[i] == key) {
            return i; // Return current index as the last occurrence
        }
        
        // Return index of the last occurrence found in deeper recursive calls
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 67, 5, 4, 6, 7, 5 }; // Sample array
        int key = 5; // Key to search for

        // Call the method and print the result
        System.out.println("Last occurrence of the given key is: " + lastAccourance(arr, key, 0));
    }
}
