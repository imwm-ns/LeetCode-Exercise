import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7}; int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void solve(int idx, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> temp) {
        if (idx == candidates.length) {
            if (target == 0) ans.add(new ArrayList<>(temp));
            return;
        }
        if (candidates[idx] <= target) {
            temp.add(candidates[idx]);
            solve(idx, candidates, target - candidates[idx], ans, temp);
            temp.remove(temp.size() - 1);
        }
        solve(idx + 1, candidates, target, ans, temp);
    } 
}
