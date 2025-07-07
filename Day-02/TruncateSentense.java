import java.util.*;

class TruncateSentense {
    public static void main(String[] args) {
    
    String s = "Hello how are you Contestant";
    String[] str = s.split(" "); 
    StringBuilder sb = new StringBuilder();
    int k = 4;
        for(int i = 0 ; i< k ; i++)
        {
            sb.append(str[i]);
            if(i != k-1) sb.append(" ");
        }
        System.out.println(sb.toString());
     /*
            OR  
        // Take first k words and join them
        String[] firstK = Arrays.copyOf(str, Math.min(k, str.length));
        System.out.println(String.join(" ", firstK));   
     */       
    }
}
/*  
 * Arrays.copyOf() :-
 *  => it take 2 params [1st from original array, 2nd is the total range]
 *  => it will create a new length and new array
 *  =>e.g:-
 *
 *  int[] originalArray = {10, 20, 30, 40, 50};
    Scenario A: Copy the first N elements
    int[] copy1 = Arrays.copyOf(originalArray, 3); // Copy first 3 elements
    copy1 will be: {10, 20, 30}
 * 
*/