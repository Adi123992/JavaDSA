package Maths_DSA;

//You are given a no. find out if its power of 2 or not
public class PowerTwo {
    public static void main(String[] args) {
        int num = 36;
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
        if ((num & (num - 1)) == 0) {
            System.out.println("It is a power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }
}
