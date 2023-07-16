public class GasSolutions {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, available = 0, index = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            available += gas[i] - cost[i];
            if (available < 0) {
                available = 0;
                index = i + 1;
            }
        }
        if (total < 0) return -1;
        return index;
    }
}
