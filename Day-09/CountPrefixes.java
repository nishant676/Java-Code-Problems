import java.util.*;

class CountPrefixes {
    public static void main(String[] args) {
  
    String []words = {"a","b","c","ab","bc","abc"};
    String s = "abc";
    int count = 0;
    
    for(String check : words)
    {
      if(s.startsWith(check)) count++;
    }
    
    System.out.println(count);
    }
}