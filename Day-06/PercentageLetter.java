import java.util.*;

class PercentageLetter {
    public static void main(String[] args) {

    String s = "foobar";
    char letter = 'o';
    int count = 0;
  
  for(char ch : s.toCharArray())
  {
    if(ch == letter) count++;
  }
  
  // Multiply first to avoid int division
  
 int percent = (int)((count * 100.0) / s.length()); 
  System.out.println(percent);
    }
}