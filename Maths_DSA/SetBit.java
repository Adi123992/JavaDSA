package Maths_DSA;

//means turn the value of ith bit to 1
public class SetBit {
    public static void main(String[] args) {
        int num = 9;
        int pos = 3;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary before setting : " + binary);
        int ans = (num | (1 << (pos - 1)));
        System.out.println("After setting the ith bit we get : " + ans);
        String b = Integer.toBinaryString(ans);
        System.out.println("Binary wise : " + b);
    }
}
