package RecursionSubsetString;

public class SkipCharacter {
    public static void main(String[] args) {
        String input = "baaaaaadddcacca";
        System.out.println("Via 4th method : ");
        skipChar4("", input, 'd');
        char ch = 'a';
        String ans = skipChar2(input, ch, 0);
        System.out.println("Via method 2 new String is : " + ans);
    }

    static String skipChar(String str, char skip) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != skip) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    //not in place recursion , here we are using a new string instead of upgrading the exisitng string
    static String skipChar2(String str, char skip, int index) {
        //base condition
        if (index == str.length()) {
            return "";
        }
        //recursive logic
        char ch = str.charAt(index);
        if (ch != skip) {
            return ch + skipChar2(str, skip, index + 1);
        } else {
            return skipChar2(str, skip, index + 1);
        }
    }

    //alternate method via substring usage
    static String skipChar3(String str, char skip) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);

        if (ch == skip) {
            return skipChar3(str.substring(1), skip);
        } else {
            return ch + skipChar3(str.substring(1), skip);
        }
    }

    //alternate method with no return type
    static void skipChar4(String nstr, String str, char skip) {
        if (str.isEmpty()) {
            System.out.println(nstr);
            return;
        }

        char ch = str.charAt(0);

        if (ch == skip) {
            skipChar4(nstr, str.substring(1), skip);
        } else {
            skipChar4(nstr + ch, str.substring(1), skip);
        }
    }
}
