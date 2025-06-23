package Maths_DSA;

//youre given a array of no. and if in that array every no appears twice only one no. appears once youve to find that no.
//using xor coz a^a = 0 and 0^a = a
public class SingleNumEven {
    public static void main(String[] args) {
        int[] arr={2,45,4,4,2,5,6,5,6};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int ans =0;// becoz 0^a=a
     for (int i : arr) {
        ans^=i;
     }
     return ans;
    
    }
}
