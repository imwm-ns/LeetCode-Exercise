import java.util.List;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, res);
        return res;
    }

    public static void solve(int idx, int[] nums, List<List<Integer>> res) {
        if (idx == nums.length) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                arr.add(nums[i]);
            }
            res.add(new ArrayList<>(arr));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i, idx, nums);
            solve(idx + 1, nums, res);
            swap(i, idx, nums);
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
