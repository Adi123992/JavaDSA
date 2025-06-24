package Maths_DSA;

// to find the position of rightmost set bit
public class SetBitPosition {
    public static void main(String[] args) {
        int num = 36;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);

        int value = num & -num;
        System.out.println("Rightmost set bit value: " + value);

        int position = Integer.numberOfTrailingZeros(value) + 1;
        System.out.println("Position (1-based): " + position);
    }
}
