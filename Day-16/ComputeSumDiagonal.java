import java.util.*;

class ComputeSumDiagonal {
    public static void main(String[] args) {
        
    int[][] mat = { {1, 2, 3, 4},
                    {4, 3, 2, 1},
                    {7, 8, 9, 6},
                    {6, 5, 4, 3}};
    
    int principalDiagonal =0;
    int secondaryDiagonal =0;
    
    for(int i = 0; i<mat.length; i++)
    {
        principalDiagonal+=mat[i][i];
    }
    
    for(int i =mat.length-1,j=0; i>=0; i--) 
    {
        secondaryDiagonal+=mat[j++][i];
    }
    System.out.println(principalDiagonal);
    System.out.println(secondaryDiagonal);
        
    }
}