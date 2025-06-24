package Maths_DSA;

public class SetBits {
    public static void main(String[] args) {
        int num = 45;
        //to see the binary representation
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        System.out.println("Number of Set Bits i.e. (1's) :" + count);
    }
}
