public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] arrayStrings = s.split(" ");
        String lastStr = arrayStrings[arrayStrings.length - 1];
        return lastStr.length();
    }
}
