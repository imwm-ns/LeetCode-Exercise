import java.util.Arrays;
import java.util.LinkedList;

public class CourseScheduleII {
    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        System.out.println(Arrays.toString(findOrder(numCourses, prerequisites)));
    }

    public static int[] findOrder (int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            int[] res = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                res[i] = i;
            }
            return res;
        }

        int[] correctCourse = new int[numCourses];
        
        int[] pCounter = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            pCounter[prerequisites[i][0]]++;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (pCounter[i] == 0) queue.add(i);
        }
        
        int numNoPre = queue.size(), j = 0;
        while (!queue.isEmpty()) {
            int c = queue.remove();
            correctCourse[j++] = c;

            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == c) {
                    pCounter[prerequisites[i][0]]--;
                    if (pCounter[prerequisites[i][0]] == 0) {
                        queue.add(prerequisites[i][0]);
                        numNoPre++;
                    }
                }
            }
        }

        if (numNoPre == numCourses) return correctCourse;
        else return new int[0];
    }
}
