package RecursionBackTracking;

//obstacle
public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };// the false path represents that we cannot use it for travelling
        allPath("", maze, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        //previously we use to take (0,0) element as the order of matrix something like (3,3) but now here we are going it in a standard way hence taking (0,0) where the base condition must be when the row and colomn of each parameter be less than the length of the matrix
        if (r == maze.length - 1 && c == maze.length - 1) {
            System.out.println(p);
            return;
        }
        //where the path is not allowed for going hence we skip that particular iteration
        if (!maze[r][c]) {
            return;
        }
        // as before where the condition was r>0 here it must be reversed as we are following the standard pattern
        if (r < maze.length - 1) {
            allPath(p + "D", maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            allPath(p + "R", maze, r, c + 1);
        }
    }
}
