import java.util.Vector;

public class AreAlmostEqual {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Vector<Character> v1 = new Vector<>();
        Vector<Character> v2 = new Vector<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                v1.add(s1.charAt(i));
                v2.add(s2.charAt(i));
            }
        }

        if (v1.size() == v2.size() && v2.size() == 0) return true;

        if (v1.size() == v2.size() && v2.size() == 2) {
            if (v1.get(0) == v2.get(1) &&
                v2.get(0) == v1.get(1)) {
                    return true;
            }
        }
        return false;
    }
}