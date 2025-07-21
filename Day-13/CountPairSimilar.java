import java.util.*;
class CountPairSimilar {
    public static void main(String[] args) {

    String []word = {"aba","aabb","abcd","bac","aabc"};
    
    int count = 0;
    
    for(int i = 0 ; i< word.length; i++)
    {
        for(int j = i+1; j<=word.length-1; j++)
        {
            Set<Character> sp1 = new HashSet<>();
            Set<Character> sp2 = new HashSet<>();
               for(char ch : word[i].toCharArray()) sp1.add(ch);
               for(char ch : word[j].toCharArray()) sp2.add(ch);
                if(sp1.equals(sp2)) count++;
        }
    }
    
    
    System.out.println(count);
    
    
    
    
    
    }
}