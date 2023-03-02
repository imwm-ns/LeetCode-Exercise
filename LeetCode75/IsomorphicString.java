import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> charMap = new HashMap<>();
        Set<Character> usedChar = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (charMap.containsKey(sChar)) {
                if (charMap.get(sChar) != tChar) return false;
            }
            else {
                if (usedChar.contains(tChar)) return false;
                charMap.put(sChar, tChar);
                usedChar.add(tChar);
            }
        }
        return true;
    }
}
