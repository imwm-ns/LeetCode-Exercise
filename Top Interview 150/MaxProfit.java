public class MaxProfit {
    public static void main(String[] args) {
        int[] nums = {2,4,1};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;

        for (int idx = 0; idx < prices.length; idx++) {
            buy = Math.min(buy, prices[idx]);
            sell = Math.max(sell, prices[idx] - buy);
        }

        return sell;
    }
}