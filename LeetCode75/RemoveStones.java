import java.util.HashSet;
import java.util.Set;

public class RemoveStones {
    public static void main(String[] args) {
        int[][] stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        System.out.println(removeStones(stones));
    }

    public static int removeStones(int[][] stones) {
        Set<int[]> visited = new HashSet<>();
        int numberOfIsland = 0;
        for (int[] s1 : stones) {
            if (!visited.contains(s1)) {
                dfs(s1, visited, stones);
                numberOfIsland++;
            }
        }
        return stones.length - numberOfIsland;
    }

    public static void dfs(int[] s1, Set<int[]> visited, int[][] stones) {
        visited.add(s1);
        for (int[] s2 : stones) {
            if (!visited.contains(s2)) {
                if (s1[0] == s2[0] || s1[1] == s2[1]) dfs(s2, visited, stones);
            }
        }
    }
}
