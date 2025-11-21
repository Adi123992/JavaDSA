package OOPS_iitm.Week5to8.Streams;

public class Assertion {
    public static void main(String[] args) {
        int age = -2;

//        // Simple assert
//        assert age >= 0;

        // Assert with message
        assert age >= 0 : "Age cannot be negative!";
    }
}
