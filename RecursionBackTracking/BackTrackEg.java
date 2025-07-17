package RecursionBackTracking;

public class BackTrackEg {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println("Path found: " + p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // Visit this cell
        System.out.println("Visiting: (" + r + ", " + c + ") — Marking as false");
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + "R", maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + "U", maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + "L", maze, r, c - 1);
        }

        // Backtrack
        maze[r][c] = true;
        System.out.println("Backtracking: (" + r + ", " + c + ") — Marking as true again");
    }
}

