import java.util.ArrayList;

public class LetterCombinationsOfPhoneNumber {

    // function with Arraylist
    public static ArrayList<String> padSet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2.

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            list.addAll(padSet(p + ch, up.substring(1)));
        }
        return list;
    }

    // function without an ArrayList
    public static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            pad(p + ch, up.substring(1));
        }
    }

    // function for an pad count

    public static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0; // initially count is 0
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padSet("", "12"));
        System.out.println("Pad count is : "+ padCount("", "12"));
    

    }
    
}
