// to find the number of steps to reduce the number to zero
package Recursion;

public class NoOfSteps {
    public static void main(String[] args) {
        System.out.println(noOfSteps(41));
    }
    static int noOfSteps(int n){
        return helper(n, 0);
    }
    static int helper(int n , int steps){
        if (n == 0) {
            return steps;
        }
        //if the number is even
        if (n%2 == 0) {
            return helper(n/2, steps+1);
        }
        // if the number is odd
        return helper(n-1, steps+1);
    }
}
