import java.util.*;

class CheckIfAllAAppears {
    public static void main(String[] args) {
    
    String str = "bbba";
    for(int i = 0 ; i< str.length()-1; i++)
    {
        if(str.charAt(i) == 'b')
        {
            if(str.charAt(i+1)!= 'b')
            {
                System.out.println(false);
                return;
            }
        }
    }
    System.out.println(true);
    
    }
}