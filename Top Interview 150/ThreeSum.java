import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = {-1,0,1};
        System.out.println(threeSum(numbers));
    }

    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(numbers); int target = 0;

        // Use 3 pointers to find sum of value is equal 0 and add it in a set.
        for (int i = 0; i < numbers.length; i++) {
            int j = i + 1; // next index of i
            int k = numbers.length - 1; // the last index of array numbers
            while (j < k) {
                int sum = numbers[i] + numbers[j] + numbers[k];
                if (sum == target) {
                    set.add(Arrays.asList(numbers[i], numbers[j], numbers[k]));
                    j++; k--;
                }
                else if (sum < target) j++;
                else k--;
            }
        }

        return res.addAll(set) ? res : new ArrayList<>();
    }
}
