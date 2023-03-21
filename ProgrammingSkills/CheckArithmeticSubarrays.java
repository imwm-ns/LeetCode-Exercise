import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CheckArithmeticSubarrays {
    public static void main(String[] args) {
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, l = {0,1,6,4,8,7}, r = {4,4,9,7,9,10};
        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int size = l.length;
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i< size; i++){
            int[] subArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            System.out.println(Arrays.toString(subArray));
            Arrays.sort(subArray);
            System.out.println(Arrays.toString(subArray));
            boolean isArithmetic = false;
            int different = subArray[1] - subArray[0];
            for(int j = 2; j< subArray.length; j++){
                if(subArray[j] - subArray[j - 1] != different){
                    list.add(false);
                    isArithmetic = true;
                    break;
                }
            }
            if(isArithmetic == false) list.add(true);
        }
        return list;
    }
}