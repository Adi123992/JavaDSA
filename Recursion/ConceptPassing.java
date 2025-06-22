package Recursion;

public class ConceptPassing {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0) {
            return;
        }
      System.out.println(n);
      fun(--n);
      //fun(n--) not possible becoz this is post decrement and the function will just keep on repeating infinite times the number 
    }
}
