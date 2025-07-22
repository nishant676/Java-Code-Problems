import java.util.*;

class TwoDimensionArray {
    public static void main(String[] args) {
        //3 * 5
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter row u need");
    int row = sc.nextInt();
    
    System.out.println("Enter cols u need");
    int cols = sc.nextInt();
    
    int[][]apt = new int[row][cols];
    for(int i = 0 ; i < row ;i++ )
    {
        for(int j = 0 ; j< cols ; j++)
        {
            System.out.println("Enter for ["+i+"] ["+j+"]");
            apt[i][j] = sc.nextInt();
        }
    }
    System.out.println(Arrays.deepToString(apt));
    sc.close();
    
    }
}