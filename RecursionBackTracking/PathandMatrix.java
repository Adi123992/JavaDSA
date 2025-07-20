package RecursionBackTracking;

import java.util.Arrays;

public class PathandMatrix {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathMatrix("", board, 0, 0, path, 1);
    }

    static void pathMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;//marking the final step
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));// priting the arrays
            }
            System.out.println(p);//printing the string path
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;           // Mark as visited
        path[r][c] = step;            // Save step at current cell
        if (r < maze.length - 1) {
            pathMatrix(p + "D", maze, r + 1, c, path, step + 1);
        }
        if (c < maze.length - 1) {
            pathMatrix(p + "R", maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            pathMatrix(p + "U", maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            pathMatrix(p + "L", maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;//reseting the boolean values for visit tracking
        path[r][c] = 0;//resetting the path as 0 for the next cell iteration
    }
}
