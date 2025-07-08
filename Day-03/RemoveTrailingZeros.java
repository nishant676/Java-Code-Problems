import java.util.*;

class RemoveTrailingZeros {
    public static void main(String[] args) {

        String s =  "51230100";
       StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length() - 1; i >= 0; i--) 
        {
            if (sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
            } else {
                break; // stop when non-zero is found
            }
        }
       System.out.println(sb.toString());
    }
}