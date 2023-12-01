public class java1768 {
    public static void main(String[] args) {

        final String word1 = "abc";
        final String word2 = "pqrc";

        System.out.println(mergeAlternately(word1, word2));

    }

    public static String mergeAlternately(String word1, String word2) {

        var sb = new StringBuilder();

        for (int i = 0; i < word1.length() + word2.length(); i++) {

            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }

}
