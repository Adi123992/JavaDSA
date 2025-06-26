package RecursionSubsetString;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(skipChar("", "abc"));
        System.out.println(skipCharAscii("", "abc"));
        skipCharAscii2("", "abc");
    }

    static ArrayList<String> skipChar(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = skipChar(p + ch, up.substring(1));
        ArrayList<String> right = skipChar(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static ArrayList<String> skipCharAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = skipCharAscii(p + ch, up.substring(1));
        ArrayList<String> second = skipCharAscii(p, up.substring(1));
        ArrayList<String> third = skipCharAscii(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

    static void skipCharAscii2(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        skipCharAscii2(p + ch, up.substring(1));
        skipCharAscii2(p, up.substring(1));
        skipCharAscii2(p + (ch + 0), up.substring(1));
    }
}
