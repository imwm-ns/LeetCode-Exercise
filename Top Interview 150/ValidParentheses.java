public class ValidParentheses {
    public static void main(String[] args) {
        
    }

    public static boolean isValid(String msg) {
        int i = -1;
        char[] words = new char[msg.length()];

        for (char word : msg.toCharArray()) {
            if (word == '(' || word == '{' || word == '[') words[++i] = word;
            else {
                if (i >= 0 && ((words[i] == '(' && word == ')') ||(words[i] == '{' && word == '}') || (words[i] == '[' && word == ']') )) i--;
                else return false;
            }
        }

        return i == -1;
    }
}
