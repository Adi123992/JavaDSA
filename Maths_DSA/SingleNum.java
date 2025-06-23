package Maths_DSA;

// every number is appearing 3 times and 1 number is appearing only ones. find that number
public class SingleNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 2, 7, 7, 8, 7, 8, 8 };
        System.out.println(findSingle(arr));
    }

    private static int findSingle(int[] arr) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;
            for (int num : arr) {
                if ((num & mask) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                res |= mask;
            }
        }
        return res;
    }

}
