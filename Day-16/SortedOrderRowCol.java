import java.util.*;

class SortedOrderRowCol {
    public static void main(String[] args) {
        
    int[][] mat =  { {10, 20, 30, 40},
                     {15, 25, 35, 45},
                     {27, 29, 37, 48},
                    {32, 33, 39, 50} };
   
   Set<Integer> st = new TreeSet<>();
   for(int i = 0; i< mat.length; i++)
   {
       for(int j = 0; j< mat[i].length; j++)
       {
           st.add(mat[i][j]);
       }
   }
    System.out.println(st);
    }
}