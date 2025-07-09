import java.util.*;

class CountWordsPrefix {
    public static void main(String[] args) {

        String [] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int count = 0 ;
        
        for(String check : words)
        {
            if(check.startsWith(pref) ) count++;
        }
        
        System.out.println(count);
        
    }
}