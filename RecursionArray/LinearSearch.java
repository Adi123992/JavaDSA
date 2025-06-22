package RecursionArray;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,8,12};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 4, arr.length-1));
    }
    static boolean find(int[] arr,int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[] a, int t, int i){
        if (i == a.length) {
            return -1;
        }
        if (a[i] == t) {
            return i;
        }
        else{
            return findIndex(a, t, i+1);
        }
    }
    static int findIndexLast(int[] a, int t, int i){
        if (i == -1) {
            return -1;
        }
        if (a[i] == t) {
            return i;
        }
        else{
            return findIndexLast(a, t, i-1);
        }
    }
}
