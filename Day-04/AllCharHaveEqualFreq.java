import java.util.*;

class AllCharHaveEqualFreq {
    public static void main(String[] args) {

    String s = "abacbc";
    
    HashMap<Character,Integer> mp = new HashMap<>();
    
    for(char ch : s.toCharArray())
    {
        mp.put(ch,mp.getOrDefault(ch,0)+1);
    }
    
    Set<Integer> check = new HashSet<>(mp.values());
    
    System.out.println("char have: "+ (check.size() == 1) );
    }
}