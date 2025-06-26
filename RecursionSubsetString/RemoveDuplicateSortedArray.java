package RecursionSubsetString;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 2, 3, 3, 4, 4, 4, 5}));
    }

    static public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
//Two pointer approach
        int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // move slow pointer
                nums[i] = nums[j]; // overwrite duplicate
            }
        }
        return i + 1; // number of unique elements
    }
}
