import java.util.*;

class CountAllSortRow
 {
    public static void main(String[] args) {
        
    int m = 4, n = 5;    
    int [][] mat = { {1, 2, 3, 4, 5},
                     {4, 3, 1, 2, 6},
                     {8, 7, 6, 5, 4},
                     {5, 7, 8, 9, 10} };

    int count = 0;
    for(int i = 0; i< m; i++)
    {
        boolean isAscending = true;
        boolean isDescending = true;
        for(int j =0 ; j<n-1;j++ )
        {
            if(mat[i][j] > mat[i][j+1]) isAscending= false;
            if(mat[i][j] < mat[i][j+1]) isDescending= false;
        }
        if(isAscending || isDescending) count++;
    }
    
    System.out.println(count);
    }
}