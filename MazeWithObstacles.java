public class MazeWithObstacles {
    public static void pathWithObstacles(String p, int row , int col , boolean[][] maze){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            pathWithObstacles(p+'D', row+1, col, maze);
        }
        if(col<maze[0].length-1){
            pathWithObstacles(p+'R', row, col+1, maze);
        }
    }
    public static void main(String[] args) {
        boolean[][] board = {
            {true , true , true},
            {true , false , true},
            {true , true , true}
        };
        pathWithObstacles("", 0, 0, board);
    }
}
