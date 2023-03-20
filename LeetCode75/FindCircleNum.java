import java.util.ArrayList;

public class FindCircleNum {
    public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(isConnected));
    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> object = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            object.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    object.get(i).add(j);
                    object.get(j).add(i);
                }
            }
        }

        int[] visited = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) if (visited[i] == 0) {
            count++;
            dfs(i, object, visited);
        }
        return count;
    }

    public static void dfs(int i, ArrayList<ArrayList<Integer>> object, int[] visited) {
        visited[i] = 1;
        for (int element : object.get(i)) if (visited[element] == 0) dfs(element, object, visited);
    }
}
