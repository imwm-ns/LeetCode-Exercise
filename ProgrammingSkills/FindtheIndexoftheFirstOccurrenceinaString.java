public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
