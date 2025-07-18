import java.util.*;

class MaximumValueofString {
    public static void main(String[] args) {

    String[] str ={"alic3","bob","3","4","00000"} ;
   int max = 0;
   
   for(String word: str)
   {
       int value;
       if(word.matches("\\d")) value = Integer.parseInt(word);
       else
       value = word.length();
       
       if(max < value) max = value;
   }

        System.out.println(max);
    }
}