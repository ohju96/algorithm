public class java345 {
    public static void main(String[] args) {

        final String s = "hello";
        System.out.println(reverseVowels(s));

        final String s2 = "leetcode";
        System.out.println(reverseVowels(s2));

    }

    public static String reverseVowels(String s) {

        char[] word = s.toCharArray();
        int start = 0;
        int end = word.length - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {

            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }

        String answer = new String(word);
        return answer;

    }
}
