import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) return null;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            List<String> val = map.get(key);
            if (val == null) val = new ArrayList<>();
            val.add(strs[i]);
            map.put(key, val);
        }
        return new ArrayList<>(map.values());
    }
}
