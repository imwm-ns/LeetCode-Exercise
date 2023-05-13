package ExtraPractice;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        List<String> res = letterCombinations("23");
        System.out.println(res);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder combination = new StringBuilder();
        backtrack(res, map, combination, digits, 0);
        return res;
    }

    private static void backtrack(List<String> res, String[] map, StringBuilder combination, String digits, int idx) {
        if (idx == digits.length()) res.add(combination.toString());
        else {
            String letters = map[digits.charAt(idx) - '0'];
            for (char letter : letters.toCharArray()) {
                combination.append(letter);
                backtrack(res, map, combination, digits, idx + 1);
                combination.deleteCharAt(combination.length() - 1);
            }
        }
    }
}