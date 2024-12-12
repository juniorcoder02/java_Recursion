import java.util.ArrayList;
public class Dice {

    public static void diceCombination(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceCombination(p + i, target - i);
        }
    }
    public static ArrayList<String> diceCombinationArrayList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceCombinationArrayList(p + i, target - i));
        }
        return list;
    }

    public static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    public static void main(String[] args) {
        diceCombination("", 4);
        System.out.println(diceCombinationArrayList("", 4));
        diceFace("", 4, 8);
    }
}
