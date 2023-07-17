import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;
        System.out.println(fullJustify(words, maxWidth));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justifyList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        int length = 0;

        for (String word : words) {
            if (length + word.length() + list.size() > maxWidth) {
                int spaces = maxWidth - length;

                for (int i = 0; i < spaces; i++) {
                    list.set(i % (list.size() - 1 != 0 ? list.size() - 1 : 1), list.get(i % (list.size() - 1 != 0 ? list.size() - 1 : 1)) + " ");
                }

                String w = "";
                
                for (String key : list) {
                    w += key;
                }

                justifyList.add(w);

                list.clear();
                length = 0;
            }

            list.add(word);
            length += word.length();
        }

        String last = String.join(" ", list);
        last += " ".repeat(maxWidth - last.length());

        justifyList.add(last);
        return justifyList;
    }
}
