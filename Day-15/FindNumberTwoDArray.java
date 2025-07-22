import java.util.*;

class FindNumberTwoDArray {
    public static void main(String[] args) {

   int [][] mat =  { {5, 4, 7},
                    {1, 3, 8},
                    {2, 9, 6}, };
                    
    int target = 9;
    
    for(int i = 0 ; i< mat.length; i++)
    {
        for(int j = 0 ; j< mat[i].length ; j++)
        {
            if(mat[i][j] == target)
            {
                System.out.println(i+","+j);
                return;
            }
        }
    }
    System.out.println("Not found");

    
    }
}