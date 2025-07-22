import java.util.*;

class FindMaxForEachRow {
    public static void main(String[] args) {

   int [][] mat =  { {5, 4, 7},
                    {1, 3, 8},
                    {2, 9, 6} };
    
    for(int i = 0 ; i< mat.length; i++)
    {
        int max = 0;
        for(int j = 0 ; j< mat[i].length ; j++)
        {
           if(max < mat[i][j]) max = mat[i][j];
        }
        System.out.println(i+1+" row: "+max);
    }

    
    }
}