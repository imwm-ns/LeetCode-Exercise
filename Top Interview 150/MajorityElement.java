import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        int res = 0;

        for (int val : map.keySet()) {
            res = (map.get(val) > nums.length / 2) ? val : res;
        }

        return res;
    }
}
