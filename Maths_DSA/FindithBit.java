package Maths_DSA;

//to find the ith bit of the number
public class FindithBit {
    public static void main(String[] args) {
        int num = 45;
        System.out.println("Number : " + num);
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation : " + binary);
        int pos = 6;
        System.out.println("Bit value : " + findBit(num, pos));
    }

    private static int findBit(int n, int p) {
        return (n & (1 << p - 1)) != 0 ? 1 : 0;
    }

}
