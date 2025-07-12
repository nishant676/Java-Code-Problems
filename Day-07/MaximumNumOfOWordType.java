import java.util.*;

class MaximumNumOfOWordType {
    public static void main(String[] args) {

      String s  = "leet code";
      String brokenLetter = "e";
      
      String[] checking = s.split(" ");
      int count = 0;
     
     for(String word : checking) 
     {
        boolean canType = true;  // Assume word is good
        for(char ch : brokenLetter.toCharArray()) 
        {
            if(word.indexOf(ch) != -1) {  // Found broken letter
                canType = false;  // Word is bad
                break;
            }
        }
        if(canType) count++;  // Only count if word is good
     }
      System.out.println(count);
    }
}