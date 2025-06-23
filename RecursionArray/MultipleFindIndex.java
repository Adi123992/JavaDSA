package RecursionArray;

import java.util.ArrayList;

public class MultipleFindIndex {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,5,6};
        ArrayList<Integer> ans = findIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findIndex2(arr, 4, 0));
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
    static ArrayList<Integer> findIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansForBelowCalls = findIndex2(arr, target, index+1);
        list.addAll(ansForBelowCalls);
        
        return list;
    }

}
