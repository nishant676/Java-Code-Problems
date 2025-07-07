
import java.util.*;

class ShuffleString {
    public static void main(String[] args) {
    
    String s ="codeleet";
    int [] arr = {4, 5, 6, 7, 0, 2, 1 ,3};
    char [] ch = new char[s.length()];
     
    for(int i = 0 ; i< ch.length ; i++)
    {
       ch[arr[i]] = s.charAt(i);
    }
    System.out.println(String.valueOf(ch));
  }
}