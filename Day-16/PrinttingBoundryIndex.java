import java.util.*;

class PrinttingBoundryIndex {
    public static void main(String[] args) {
        
    int[][] mat = { {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {1, 2, 3, 4},
                    {5, 6, 7, 8}};
   
    int n = mat.length;
    int total = n*n;
    
    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

          // Print if it's first row OR last row
        // OR first column OR last column
        if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) 
    {                  
      System.out.print(mat[i][j] + " ");
     } 
        else {
            System.out.print("  "); // print space inside the matrix
                }
            }
            System.out.println();
    }
    }
}