public class HIndex {
    public static int hIndex(int[] citations) {
        int len = citations.length, totalCitations = 0;
        int[] paper_frequency = new int[len + 1];

        for (int count : citations) {
            if (count > len) paper_frequency[len]++;
            else paper_frequency[count]++;
        }

        for (int index = len; index >= 0; index--) {
            totalCitations += paper_frequency[index];
            if (totalCitations >= index) return index;
        }

        return -1;
    }
}