package RecursionSubsetString;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(subSequence("", "abc"));
        System.out.println(subSequenceAscii2("", "abc"));
        subSequenceAscii("", "abc");
    }

    static ArrayList<String> subSequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSequence(p + ch, up.substring(1));
        ArrayList<String> right = subSequence(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static ArrayList<String> subSequenceAscii2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSequenceAscii2(p + ch, up.substring(1));
        ArrayList<String> second = subSequenceAscii2(p, up.substring(1));
        ArrayList<String> third = subSequenceAscii2(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

    static void subSequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSequenceAscii(p + ch, up.substring(1));
        subSequenceAscii(p, up.substring(1));
        subSequenceAscii(p + (ch + 0), up.substring(1));
    }
}
