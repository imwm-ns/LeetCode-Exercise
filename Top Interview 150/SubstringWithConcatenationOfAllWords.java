import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String msg = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        findSubstring(msg, words);
    }

    public static List<Integer> findSubstring(String msg, String[] words) {
        if (words.length == 0 || words[0].length() * words.length > msg.length()) return new ArrayList<>();

        Map<String, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println(freq);

        int length = words[0].length();

        String[] arr = new String[msg.length()];

        for (int i = 0; i < length; i++) {
            Map<String, Integer> window = new HashMap<>();

            int start = i, size = 0;

            for (int j = i; j <= msg.length() - length; j += length) {
                arr[j] = msg.substring(j, j + length);

                if (freq.containsKey(arr[j])) {
                    start = start == -1 ? j : start;

                    window.put(arr[j], window.getOrDefault(arr[j], 0) + 1);

                    size++;

                    if (size == words.length) {
                        if (window.equals(freq)) res.add(start);

                        window.put(arr[start], window.get(arr[start]) - 1);
                        start += length;
                        size--;
                    }
                }
                else {
                    start = - 1; size = 0;
                    window.clear();
                }
            }
        }

        return res;
    }
}
