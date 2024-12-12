
import java.nio.file.Path;

public class MazeProblem{
    public static int findWays(int row , int col){
        if (row==1 || col==1){
            return 1;
        }
        int left = findWays(row-1 , col);
        int right = findWays(row , col-1);
        return left+right;
    }

    public static void printPath(String p , int row , int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1) printPath(p+'D', row-1, col);
        if(col>1) printPath(p+'R', row, col-1);
    }
    public static void main (String[] args){
        int row = 3;
        int col = 3;
        System.out.println(findWays(row, col));
        printPath("", row, col);
    }
}