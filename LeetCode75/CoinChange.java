import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5}; int amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = minCoins(coins , amount ,dp); 
        if(ans!= Integer.MAX_VALUE){
            return ans;
        }else{
            return -1;
        }
    }

    public static int minCoins(int[] coins,int n ,int[] dp){
        if(n == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++){
            if(n - coins[i] >= 0){
            int subAns = 0;
            if(dp[n - coins[i]] != -1){
                subAns = dp[n - coins[i]];
            }else{
                subAns = minCoins(coins, n - coins[i], dp);
            }
            if(subAns != Integer.MAX_VALUE && subAns + 1 <ans){
                ans = subAns + 1;
            }
          }
        }
        return dp[n] = ans;
    }
}
