public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] num) {
        if (num.length == 1) return num;

        int tmp = 1; int[] res = new int[num.length];

        for (int i = 0; i < num.length; i++) res[i] = tmp;

        for (int i = 0; i < num.length; i++) {
            res[i] = tmp;
            tmp *= num[i];
        }

        tmp = 1;

        for (int i = num.length - 1; i >= 0; i--) {
            res[i] *= tmp;
            tmp *= num[i];
        }

        return res;
    }
}