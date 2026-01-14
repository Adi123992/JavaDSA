package LinkedList;

//202: Happy Number is where the final sum of the digits is equal to 1
// I approached it via fast and slow pointer method
public class HappyNumber {
    public static boolean happyNum(int n) {
        int slow = n;
        int fast = n;
        do {
            //steps by one
            slow = findSqr(slow);
            //steps by two
            fast = findSqr(findSqr(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private static int findSqr(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        boolean res = happyNum(18);
        System.out.println(res);
    }
}
