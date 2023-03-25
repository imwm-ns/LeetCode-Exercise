import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }   
    
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int[] pCount = new int[26];

        for (char ch : pArr) {
            pCount[ch - 'a']++;
        }
        int l = 0;
        int[] count = new int[26];
        for (int i = 0 ; i <sArr.length; i++) {
            int idx = sArr[i] - 'a';
            count[idx]++;
            if (count[idx] > pCount[idx]) {
                while (count[idx] != pCount[idx]) {
                    count[sArr[l++] - 'a']--;
                }
            }
            if (i- l + 1 == pArr.length) res.add(l);
        }
        return res;
    }
}
