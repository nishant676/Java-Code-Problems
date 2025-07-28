import java.util.*;

class UpperTriangular {
    public static void main(String[] args) {

        int[][] matrix = {   { 9, 8, 7 },
                             { 5, 4, 6 },
                             { 1, 2, 3 } };
   
       for(int i = 0; i< matrix.length; i++)
       {
           for(int j=0;j< i ; j++) 
           {
            System.out.print(" ");
           }
           for(int j = i ; j< matrix[i].length ; j++)
           {
             System.out.print(matrix[i][j]+" ");
               
           }
           System.out.println();
       }

    }
}