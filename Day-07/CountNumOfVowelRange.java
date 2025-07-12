import java.util.*;

class CountNumOfVowelRange {
    public static void main(String[] args) {

      String[] words ={"are", "amy","u"};
      int left = 0, right = 2;
      int count = 0;
      String vowel = "aeiou";
     String[]newCheck = Arrays.copyOfRange(words, left,right+1);
      
      for(String check : newCheck)
      {
          if(vowel.indexOf(check.charAt(0)) !=-1  &&
             vowel.indexOf(check.charAt(check.length()-1)) !=-1)
            count++;
      }
      
      System.out.println(count);
    }
}