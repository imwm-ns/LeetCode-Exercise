import java.util.*;

public class NumBusesToDestination {
    public static void main(String[] args) {
        int[][] routes = {{1,2,7}, {3,6,7}};
        int source = 1, target = 6;
        System.out.println(numBusesToDestination(routes, source, target));
    }

    public static int numBusesToDestination (int[][] routes, int source, int target) {
        HashMap<Integer, HashSet<Integer>> busRoutes = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j : routes[i]) {
                if (!busRoutes.containsKey(j)) busRoutes.put(j, new HashSet<Integer>()); // If bus routes have not bus stop. Add it into bus routes.
                busRoutes.get(j).add(i); // Add position of routes in bus routes.
            }
        }
        Queue<int[]> bfs = new ArrayDeque<>(); // Create queue for keep bfs
        bfs.offer(new int[] {source, 0}); // In a initialize bfs keep source and 0 for check start point.
        HashSet<Integer> routesSeen = new HashSet<>(); // 
        routesSeen.add(source);
        boolean[] seen_routes = new boolean[routes.length];
        while (!bfs.isEmpty()) {
            int stop = bfs.peek()[0], bus = bfs.peek()[1];
            bfs.poll();
            if (stop == target) return bus;
            for (int i : busRoutes.get(stop)) {
                if (seen_routes[i]) continue;
                for (int j : routes[i]) {
                    if (!routesSeen.contains(j)) {
                        routesSeen.add(j);
                        bfs.offer(new int[] {j, bus + 1});
                    }
                }
                seen_routes[i] = true;
            }
        }
        return -1;
    }
}   
