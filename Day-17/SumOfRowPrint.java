import java.util.*;

class SumOfRowPrint {
    public static void main(String[] args) {

        int[][] matrix = { {1,2,3},
                            {4,5,6},
                            {7,8,9} };
      int [][] newmatrix = 
                     new int[matrix.length][(matrix[0]).length+1] ;
      
        for(int i = 0 ; i< matrix.length; i++)
        {
            int sum = 0;
            for(int j = 0 ; j< matrix[i].length; j++)
            {
                newmatrix[i][j] = matrix[i][j];
                sum+= matrix[i][j]; 
            }
            int col = (newmatrix[i].length-1);
            newmatrix[i][col] = sum;
        } 
        System.out.println(Arrays.deepToString(newmatrix));
    }
}