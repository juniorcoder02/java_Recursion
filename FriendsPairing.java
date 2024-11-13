public class FriendsPairing {

    // Recursive function to calculate the number of ways friends can pair up
    public static int friendsPairing(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return n; // 1 way if n=1, 2 ways if n=2
        }

        // Choice 1: Friend remains single
        int singleWays = friendsPairing(n - 1);

        // Choice 2: Friend pairs with any of the (n-1) other friends
        int pairWays = (n - 1) * friendsPairing(n - 2);

        // Total ways
        int totalWays = singleWays + pairWays;
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        System.out.println("Number of ways " + n + " friends can pair up: " + friendsPairing(n));
    }
}
