package ExtraPractice;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        recurse(s, ans, 0, "", 0);
        return ans;
    }

    public static void recurse(String curr, List<String> ans, int idx, String temp, int count) {
        if (count > 4) return;
        if (count == 4 && idx == curr.length()) ans.add(temp);

        for (int i = 1 ; i < 4; i++) {
            if (idx + i > curr.length()) break;
            String s = curr.substring(idx, idx + i);
            if ((s.startsWith("0") && s.length() > 1) || (i == 3 && Integer.parseInt(s) >= 256)) continue;
            recurse(curr, ans, idx + i, temp + s + (count == 3 ? "" : "."), count + 1);
        }
    }
}
