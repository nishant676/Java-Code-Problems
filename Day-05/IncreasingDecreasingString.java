import java.util.*;

class IncreasingDecreasingString {
    public static void main(String[] args) {
       
        String s =  "rat";
        int[] count = new int[26];
       
        for(char ch : s.toCharArray())
        {
            count[ch - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        
        while(result.length() < s.length())
        {
            for(int i = 0 ; i< 26 ; i++)
            {
                if(count[i] > 0)
                {
                    result.append((char) (i + 'a'));
                    count[i]--;
                }
            }
            for(int i =25; i>=0; i--)
            {
                if(count[i] > 0)
                {
                    result.append((char) (i + 'a'));
                    count[i]--;
                }
            }
        }
        System.out.println(result.toString());
    }
}
// Step-1:-pick small and append to result
// Step-2:-pick small char && char > last append char find and append to result
// Step-3:-repeat untill u can't pick more
// Step-4:-pick largest char from s and append result
//Step-5:-pick largest char from s && that char < last append result char
// Step-6:-repeat it untill you can't pick more
//Step-7:-repeat all the step untill u append all char from s
//if char repeat u can append it directly