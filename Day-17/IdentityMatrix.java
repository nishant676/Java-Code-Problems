import java.util.*;

class IdentityMatrix {
    public static void main(String[] args) {

        int[][] matrix = {   { 1, 0, 0 },
                             { 2, 1, 0 },
                             { 0, 0, 1 } };
     
       for(int i = 0 ; i< matrix.length; i++)
       {
           for(int j = 0 ; j< matrix[i].length; j++)
           {
               if(i!=j && matrix[i][j]!= 0)
               {
                   System.out.println("not identity");
                   return;
               }
              
           }
       }
       System.out.println("Identity");
    }
}