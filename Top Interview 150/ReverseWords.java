public class ReverseWords {
    public static void main(String[] args) {
       String str = "a good   example";
       System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) {
            res +=  words[i] + " ";
        }
        return res.strip();
    }
}