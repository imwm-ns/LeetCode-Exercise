public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        String res = "";

        for (int i = 0; i < command.length(); i++) {
            if (command.substring(i, i + 1).equals("(")) {
                if (command.substring(i + 1, i + 2).equals(")")) res += "o";
            }
            else if (!command.substring(i, i + 1).equals(")")) res += command.substring(i, i + 1);
        }
        return res;
    }
}