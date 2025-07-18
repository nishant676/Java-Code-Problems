import java.util.*;

class ShortestDistanceToChar
 {
    public static void main(String[] args) {

    String s = "loveleetcode", c = "e";  

int [] values = new int[s.length()];

List<Integer> al = new ArrayList<>();
for(int i = 0; i<s.length(); i++)
{
    if(s.charAt(i) == c.charAt(0)) al.add(i);
}

for(int i = 0; i< s.length(); i++)
{   int n = Integer.MAX_VALUE;
    for(int k = 0; k< al.size(); k++)
    {
        int val = Math.abs(i - al.get(k));
        if(n > val) n = val;
    }
    values[i] = n;
}


System.out.println(Arrays.toString(values));
    }
}