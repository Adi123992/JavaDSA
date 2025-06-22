package RecursionArray;

import java.util.ArrayList;

public class MultipleFindIndex {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,5,6};
        ArrayList<Integer> ans = findIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndex(arr, target, index+1, list);
    }
}
