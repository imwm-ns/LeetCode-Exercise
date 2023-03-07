public class MergeAlternately {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String newWord = "";

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                newWord += word1.substring(i, i + 1) + word2.substring(i, i + 1);
            }
        }
        else if (word1.length() < word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                if (i < word1.length()) newWord += word1.substring(i, i + 1);
                newWord += word2.substring(i, i + 1);
            }
        }
        else if (word1.length() > word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                newWord += word1.substring(i, i + 1);
                if (i < word2.length()) newWord += word2.substring(i, i + 1);
            }
        }
        return newWord;
    }
}