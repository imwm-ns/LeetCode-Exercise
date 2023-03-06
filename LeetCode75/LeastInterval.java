public class LeastInterval {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tasks, 2));
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] alphabets = new int[26];
        int max = 0;
        int maxCount = 0;
        
        for (char task : tasks) {
            alphabets[task - 'A']++;
            if (max == alphabets[task - 'A']) {
                maxCount++;
            }
            else if (max < alphabets[task - 'A']) {
                max = alphabets[task - 'A'];
                maxCount = 1;
            }
        }

        int count = max - 1;
        int length = n - (maxCount - 1);
        int emptySlots = count * length;
        int availableTasks = tasks.length - (max * maxCount);
        int idles = Math.max(0, emptySlots - availableTasks);
        
        return tasks.length + idles;
    }
}
