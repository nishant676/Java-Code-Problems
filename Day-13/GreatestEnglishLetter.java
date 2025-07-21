import java.util.*;

class GreatestEnglishLetter {
    public static void main(String[] args) {

    String word = "lEeTcOdE";
    Set<Character> sp = new HashSet<>();
    
    for(char ch : word.toCharArray())
    {
        sp.add(ch);
    }
    
    for(char c = 'Z' ; c >='A';c--)
    {
        if(sp.contains(c) && sp.contains(Character.toLowerCase(c)))
        {
            System.out.println(" "+c);
            return;
        }
    }
   
    System.out.println(" ");
    
    
    
    
    
    }
}