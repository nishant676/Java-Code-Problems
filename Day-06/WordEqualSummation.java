import java.util.*;

class WordEqualSummation {
    public static void main(String[] args) {

    String firstWord =  "aaa";
    String secondWord = "a";
    String targetWord = "aab";
    
    int first = getValue(firstWord); 
    int second = getValue(secondWord);
    int target = getValue(targetWord);
    
    System.out.println((target == (first+second)));
    }
    public static int getValue(String word)
    {
        StringBuilder sb = new StringBuilder();
        
        for(char ch : word.toCharArray())
        {
            sb.append(ch - 'a');
        }
        return Integer.parseInt(sb.toString());
    }
}