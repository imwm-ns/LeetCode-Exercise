import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] num = {0,1,2,4,5,7};
        System.out.println(summaryRanges(num));
    }

    public static List<String> summaryRanges(int[] num) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            int start = num[i];

            while (i + 1 < num.length && num[i + 1] == num[i] + 1) i++;

            if (start != num[i]) res.add("" + start + "->" + num[i]);
            else res.add("" + start);
        }

        return res;
    }
}