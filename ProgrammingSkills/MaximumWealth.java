public class MaximumWealth {
    public static void main(String[] args) {
        
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sumWealth = 0;
            for (int wealth : account) sumWealth += wealth;
            if (sumWealth > maxWealth) maxWealth = sumWealth;
        }
        return maxWealth;
    }
}
