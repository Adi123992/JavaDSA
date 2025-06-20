public class FlipInvertImg {

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] ans = flipImg(image);
        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < ans[i].length; j++) {
        // System.out.println(ans[i][j]);
        // }
        // System.out.println(" ");
        // }
        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipImg(int[][] img) {
        for (int[] row : img) {
            // reverse this array
            for (int i = 0; i < (img[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i];
                row[i] = row[img[0].length - 1 - i];
                row[img[0].length - 1 - i] = temp;
            }
            for (int i = 0; i < img.length; i++) {
                row[i] = row[i] ^ 1;
            }
        }
        return img;
    }
}