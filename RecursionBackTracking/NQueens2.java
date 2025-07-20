package RecursionBackTracking;

public class NQueens2 {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        int solutions = queens(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    static int queens(boolean[][] board, int row) {
        // Base condition: If all queens are placed (row reaches board.length)
        if (row == board.length) {
            displayq(board);
            System.out.println(); // Extra line for separation between solutions
            return 1; // Found one solution
        }

        int count = 0;
        // Try placing the queen in each column of the current row
        for (int col = 0; col < board.length; col++) {
            // Place the queen if it is safe in this cell
            if (isSafe(board, row, col)) {
                board[row][col] = true; // Place the queen
                count += queens(board, row + 1); // Recurse for the next row
                board[row][col] = false; // Backtrack: remove the queen for the next iteration
                // This is crucial to explore other possibilities in the current row
            }
        }
        return count; // Return the total count of solutions from this path
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical column (only above the current row)
        for (int i = 0; i < row; i++) { // Iterate from row 0 up to the current row - 1
            if (board[i][col]) { // If there's a queen in the same column above
                return false;
            }
        }

        // Check left diagonal (upper-left)
        // Start from (row-1, col-1) and move towards (0,0)
        int r = row - 1;
        int c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Check right diagonal (upper-right)
        // Start from (row-1, col+1) and move towards (0, board.length-1)
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board.length) { // `c < board.length` is important
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        // If no conflicts found, it's safe to place the queen
        return true;
    }

    // Displays the board configuration for a solution
    private static void displayq(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q "); // Queen
                } else {
                    System.out.print("X "); // Empty
                }
            }
            System.out.println(); // New line after each row to format the board
        }
    }
}