public class RecursionBasics {

    public static void printDecNumbers(int n) {
        if (n == 1) { // base case
            System.out.print(n + " ");

            return;
        }
        System.out.print(n + " ");
        printDecNumbers(n - 1); // inner function call
    }

    public static void printIncNUmbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");

            return;
        }
        printIncNUmbers(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printDecNumbers(n);
        printIncNUmbers(n);
    }
}