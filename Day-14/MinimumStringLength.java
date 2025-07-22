import java.util.*;

class MinimumStringLength {
    public static void main(String[] args) {

    String s = "ABFCACDB";
 
    Stack <Character> st = new Stack<>();
    
    for(char ch : s.toCharArray())
    {
        if(!st.isEmpty())
        {
            char top = st.peek();
             if( (top == 'A' && ch == 'B') || (top == 'C' && ch == 'D') )
            {
                st.pop(); //remove the matching pair
                continue;
            }
        }
        st.push(ch);// push if no match
    }
    
    System.out.println(st.size());
    
    }
}