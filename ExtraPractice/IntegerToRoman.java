package ExtraPractice;

public class IntegerToRoman {
    public static void main(String[] args) {
        
    }

    public static String intToRoman(int num) {
        String[] oneDigit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] twoDigits = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] threeDigits = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] fourDigits = {"", "M", "MM", "MMM"};
        return fourDigits[num / 1000] + threeDigits[(num % 1000) / 100] + twoDigits[(num % 100) / 10] + oneDigit[num % 10];
    }
}
