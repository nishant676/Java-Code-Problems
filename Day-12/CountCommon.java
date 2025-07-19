import java.util.*;

class CountCommon {
    public static void main(String[] args) {
    
    String [] word1 = {"a","ab"};
    String [] word2 = {"a","a","a","ab"};
    
    Map<String,Integer> mp1 = new HashMap<>();
    Map<String,Integer> mp2 = new HashMap<>();
    int count = 0;
    
    for(String insert : word1) 
    {
        mp1.put(insert,mp1.getOrDefault(insert,0)+1);
    }
     for(String insert : word2) 
    {
        mp2.put(insert,mp2.getOrDefault(insert,0)+1);
    }

    for(String key : mp1.keySet())
    {
        if(mp1.get(key) == 1 && mp2.getOrDefault(key,0)==1) 
        count++;
    }
  
    
    System.out.println(count);
    
    }
}