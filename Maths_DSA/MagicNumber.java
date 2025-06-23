package Maths_DSA;

// to find the magic number via the binary form of the number and multiplying the 5 power according to the digit place
public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans=0;
        int base=5;
        while (n>0) {
            int last = n&1;
            ans+=last*base;
            base = base*5;
            n=n>>1; 
        }
        System.out.println("The Magic Number is : "+ans);
    }
}
