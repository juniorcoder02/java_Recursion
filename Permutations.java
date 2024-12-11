
import java.util.ArrayList;

public class Permutations {

    // function without using an ArrayList
    public static void findAllPermutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            findAllPermutations(f + ch + s, up.substring(1));
        }
    }


        // function using an ArrayList
    public static ArrayList<String> findAllPermutationsArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(findAllPermutationsArrayList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        findAllPermutations("", "abc");

        ArrayList<String> ans = findAllPermutationsArrayList("", "abc");
        System.out.println(ans);
    }
}
