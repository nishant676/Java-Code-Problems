import java.util.*;

class KthDistinctStringArray
 {
    public static void main(String[] args) {
    
    String[] arr = {"aaa","aa","a"};
    int k = 1;
    
    Map<String,Integer> mp = new LinkedHashMap<>();
    List <String> list = new ArrayList<>();
    
    for(String word : arr)
    {
        mp.put(word,mp.getOrDefault(word,0)+1);
    }
    
    for(String check : arr)
    {
        if(mp.get(check) == 1) list.add(check);
    }
    if(list.size() < k) {
        System.out.println(" ");
        return;
    }
    else
    {
        System.out.println(list.get(k-1));
    }
    
    }
}