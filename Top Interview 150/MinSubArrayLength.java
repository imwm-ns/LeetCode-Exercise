public class MinSubArrayLength {
    public static void main(String[] args) {
        int[] numbers = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLength(numbers, target));
    }

    public static int minSubArrayLength(int[] numbers, int target) {
        int start = 0, sum = 0, n = numbers.length, minLength = Integer.MAX_VALUE;

        for (int end = 0; end < n; end++) {
            sum += numbers[end];
            
            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= numbers[start];
                start++;
            }
        }

        return  minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
