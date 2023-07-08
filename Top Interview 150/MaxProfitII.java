public class MaxProfitII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitII(prices));
    }

    public static int maxProfitII(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) totalProfit += Math.max(prices[i] - prices[i - 1], 0);
        return totalProfit;
    }
}
