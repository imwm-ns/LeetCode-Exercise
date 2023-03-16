import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        String ans = "";
        int matchCount = 0;
        int reqCount = t.length();
        int i = -1;
        int j = -1;

        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
    
        while(true) {

            boolean flag1 = false;
            boolean flag2 = false; 

            //acquire
            while(i<s.length()-1 && matchCount < reqCount) {
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if(map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchCount++;
                }

                flag1 = true;
            }

            //Collect answer and release
            while(j < i && matchCount == reqCount) {

                // collect answer
                String pans = s.substring(j+1, i+1);
                if(ans.length()==0 || pans.length()<ans.length()){
                    ans = pans;
                }

                // release
                j++;
                char ch = s.charAt(j);
                if(map1.get(ch) == 1) {
                    map1.remove(ch);
                }
                else {
                    map1.put(ch, map1.get(ch)-1);
                }

                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch,0)) {
                    matchCount--;
                }

                flag2 = true;
            }

            if(flag1 == false && flag2 == false) {
                break;
            }
        }
        return ans;
    }
}
