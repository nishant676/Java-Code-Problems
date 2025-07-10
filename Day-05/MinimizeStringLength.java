import java.util.*;

class MinimizeStringLength {
    public static void main(String[] args) {
    
    String s = "aaabc";
    Set<Character> check = new HashSet<>();

    for(char ch:s.toCharArray())
    {
        check.add(ch);
    }
    
    int size = check.size();
    
    System.out.println(size);
    
    }
}