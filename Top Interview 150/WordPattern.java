import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        String[] arr = s.split(" ");

        if (arr.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (map1.containsKey(pattern.charAt(i))) {
                if (!map1.get(pattern.charAt(i)).equals(arr[i])) return false;
            }
            map1.put(pattern.charAt(i), arr[i]);

            if (map2.containsKey(arr[i])) {
                if (!(map2.get(arr[i]) == pattern.charAt(i))) return false;
            }
            map2.put(arr[i], pattern.charAt(i));
        }
        
        return true;
    }
}