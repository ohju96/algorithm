public class java1071 {
    public static void main(String[] args) {

        final String str1 = "ABCABC";
        final String str2 = "ABC";

        final String str3 = "ABABAB";
        final String str4 = "ABAB";

        final String str5 = "LEET";
        final String str6 = "CODE";

        System.out.println(gcdOfStrings(str1, str2)); // ABC
        System.out.println(gcdOfStrings(str3, str4)); // AB
        System.out.println(gcdOfStrings(str5, str6)); // ""
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

