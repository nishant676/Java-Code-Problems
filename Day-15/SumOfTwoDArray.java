import java.util.*;

class SumOfTwoDArray
 {
    public static void main(String[] args) {

   int [][] mat =  { {5, 4, 7},
                    {1, 3, 8},
                    {2, 9, 6} };
                    
    int sum = 0;
    
    for(int i = 0 ; i< mat.length; i++)
    {
        for(int j = 0 ; j< mat[i].length ; j++)
        {
           sum+= mat[i][j];
        }
    }
    System.out.println("sum"+sum);

    
    }
}