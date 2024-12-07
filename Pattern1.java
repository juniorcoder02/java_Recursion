public class Pattern1 {
    public static void triangle(int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            System.out.print("*");
            triangle(row, col+1);

        } else {
            System.out.println();
            triangle(row-1, 0);

        }
    }

    public static void main(String[] args) {
        int n = 4; 
        triangle(n, 0 );
    }
}
