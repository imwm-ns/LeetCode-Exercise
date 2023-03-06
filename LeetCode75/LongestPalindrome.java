import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        
    }

    public static int longestPalindrome(String[] words) {
        int result = 0;
        int count = 0;
        boolean flag = false;

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            }
            else map.put(word, 1);
        }

        for (String word : map.keySet()) {
            String rev = new StringBuilder(word).reverse().toString();
            if (word.charAt(0) == word.charAt(1)) {
                count = map.get(word);
                if (count % 2 != 0 ) {
                    count--;
                    flag = true;
                }
                result += count * 2;
            }
            else if (word.charAt(0) != word.charAt(1) && map.containsKey(rev)) {
                result += (Math.min(map.get(word), map.get(rev))) * 4;
                map.replace(word, 0);
            }
        }

        if (flag) result += 2;
        return result;
    }
}
