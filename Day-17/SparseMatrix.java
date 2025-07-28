import java.util.*;

class SparseMatrix {
    public static void main(String[] args) {

        int[][] matrix = {   { 1, 0, 0 },
                             { 2, 1, 0 },
                             { 4, 8, 1 } };
     int zero = 0;
     int nonZero = 0;
        for(int i = 0; i< matrix.length; i++)
        {
            for(int j = 0 ; j< matrix[i].length; j++)
            {
                if(matrix[i][j]!=0) nonZero++;
                else zero++;
            }
        }
        
        if(zero > nonZero )
        {
            System.out.println("Matrix sparse");
        }
        else
        {
            System.out.println("Not sparse:" );
        }
       
    
    }
}