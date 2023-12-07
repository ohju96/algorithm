public class java151 {

    public static void main(String[] args) {

        final String s = "the sky is blue";
        System.out.println(reverseWords(s));

        final String s2 = "  hello world!  ";
        System.out.println(reverseWords(s2));
    }

    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        String out = "";

        for (int i = str.length - 1; i > 0; i --) {
            out += str[i] + " ";
        }

        return out + str[0];
    }
}
