import java.util.*;

class SplitStringSeparator {
    public static void main(String[] args) {

        String[] words = {"one.two.three", "four.five", "six"};
        String separator = ".";

        List<String> singly = new ArrayList<>();

        for (String word : words) {
            String[] newWord = word.split("\\.");
            for (String check : newWord) {
                if (!check.isEmpty()) {
                    singly.add(check);
                }
            }
        }

        System.out.println(singly);
    }
}
