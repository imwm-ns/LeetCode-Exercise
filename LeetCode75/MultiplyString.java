public class MultiplyString {
    public String multiply(String num1, String num2) {
        return String.valueOf((new java.math.BigInteger(num1).multiply(new java.math.BigInteger(num2))));
    }
}
