class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        return multiplyProduct(n) - sumProduct(n);
    }

    public static int multiplyProduct(int n) {
        if (n == 0) return 1;
        return (n % 10) * multiplyProduct(n / 10);
    }

    public static int sumProduct(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumProduct(n / 10);
    }
}
