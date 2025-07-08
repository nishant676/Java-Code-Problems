import java.util.*;

class StringHalvesAlike {
    public static void main(String[] args) {

        String s =  "book";
       int n = s.length();
       String vowels = "aAeEiIoOuU";
       int count1= 0, count2 = 0;
       
       for(int i = 0 ; i< n/2 ; i++)
       {
            if (vowels.indexOf(s.charAt(i)) != -1) count1++;
            if(vowels.indexOf(s.charAt(i+ n/2)) != -1) count2++;
       }
       System.out.println("Alike: " + (count1 == count2) );
    }
}