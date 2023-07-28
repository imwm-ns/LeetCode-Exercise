import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] num = {1,2,3,1,2,3}; int k = 3;
        System.out.println(containsNearbyDuplicate(num, k));
    }

    public static boolean containsNearbyDuplicate(int[] num, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i]) && i - map.get(num[i]) <= k) return true;
            map.put(num[i], i);
        }
        
        return false;
    }
}
