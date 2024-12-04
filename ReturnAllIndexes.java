
import java.util.ArrayList;

public class ReturnAllIndexes {
    public static ArrayList<Integer> findAllIndexes(int[] arr, int key, int idx, ArrayList<Integer> result) {
        if (idx == arr.length) {
            return result;
        }
        if (arr[idx] == key) {
            result.add(idx);
        }
        return findAllIndexes(arr, key, idx + 1, result);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 2, 4, 4, 3, 4, 5, 4 };
        int key = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndexes(arr, key, 0, list));

    }
}
