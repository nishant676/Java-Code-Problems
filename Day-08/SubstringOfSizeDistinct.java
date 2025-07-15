import java.util.*;

class SubstringOfSizeDistinct {
    public static void main(String[] args) {
        String s = "aababcabc";
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3); // Get substring of size 3
            Set<Character> set = new HashSet<>();

            // Add characters to set to check uniqueness
            for (char c : sub.toCharArray()) {
                set.add(c);
            }

            // If all 3 characters are unique
            if (set.size() == 3) {
                count++;
            }
        }

        System.out.println("Total good substrings: " + count);
    }
}
