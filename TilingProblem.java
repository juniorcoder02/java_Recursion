public class TilingProblem {

    // Recursive function to calculate the number of ways to tile a 2 x n floor
    public static int tilingProblem(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1; // Only one way to tile 2 x 0 (do nothing) or 2 x 1 (one vertical tile)
        }

        // Recursive calls
        int verticalPlacement = tilingProblem(n - 1); // Case 1: Place one tile vertically
        int horizontalPlacement = tilingProblem(n - 2); // Case 2: Place two tiles horizontally

        // Total ways for 2 x n floor
        int totalWays = verticalPlacement + horizontalPlacement;
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println("Number of ways to tile a 2 x " + n + " floor: " + tilingProblem(n));
    }
}
