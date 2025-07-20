package RecursionBackTracking;

import static java.lang.Math.min;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            displayq(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;//backtracking : resetting the board array to the original ones for next iteration
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //checking the vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // checking the upper-left subpart diagonally
        int maxLeft = min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // checking the upper-right subpart diagonally
        int maxRight = min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        //if any of this aint matching in the left condition then it is right place to place the queen there
        return true;
    }

    //displaying the possible outputs of the placement of queens
    private static void displayq(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }
}
