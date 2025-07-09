import java.util.*;

class StrungWithOddCount{
    public static void main(String[] args) {

       int n = 5; // example
        StringBuilder sv = new StringBuilder();
        
        // Alternate between two characters
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sv.append('m');
            } else {
                sv.append('n');
            }
        }
        
        System.out.println(sv.toString());
    }
}