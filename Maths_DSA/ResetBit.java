package Maths_DSA;

//reset means make 1 as 0
public class ResetBit {
    public static void main(String[] args) {
        int num = 9;
        int pos = 1;
        String binary = Integer.toBinaryString(num);
        System.out.println("Before : " + binary);
        int ans = (num & ~(1 << (pos - 1)));
        String b = Integer.toBinaryString(ans);
        System.out.println("After : " + b);
    }
}
