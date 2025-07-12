import java.util.*;

class FirstLetterAppear {
    public static void main(String[] args) {

      String s  = "abcdd";
      char ans = firstLetterTwiceHashSet(s);
      System.out.println(ans);
    }
     public static char firstLetterTwiceHashSet(String s) {
        Set<Character> seen = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return c; // Found first character that appears twice
            }
            seen.add(c);
        }
        return ' '; // This should never happen based on problem constraints
    }
}