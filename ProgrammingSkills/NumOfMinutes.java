public class NumOfMinutes {
    public static void main(String[] args) {
        int n = 6, headID = 2;
        int[] manager = {2,2,-1,2,2,2}, informTime = {0,0,1,0,0,0};
        System.out.println(numOfMinutes(n, headID, manager, informTime));
    }

    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dfs(i, informTime, manager));
        }
        return result;
    }

    public static int dfs(int i, int[] informTime, int[] manager) {
        if (manager[i] != -1) {
            informTime[i] += dfs(manager[i], informTime, manager);
            manager[i] = -1;
        }
        return informTime[i];
    }
}
