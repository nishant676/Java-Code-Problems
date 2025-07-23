
>[!NOTE]
>int rows = mat.length;    // total number of rows
>int cols = mat[0].length;// total number of columns (in first row)
>int total = rows * cols;         // total number of elements

# Q1.Sort the given matrix
 
 ## Given a n x n matrix. The problem is to sort the given matrix in strict order. Here strict order means that the matrix is sorted in a way such that all elements in a row are sorted in increasing order and for row ‘i’, where 1 <= i <= n-1, the first element of row ‘i’ is greater than or equal to the last element of row ‘i-1’.
 
 **Examples:** 
Input : mat[][] = { {5, 4, 7},
                    {1, 3, 8},
                    {2, 9, 6} }
 Output :
         1 2 3
         4 5 6
         7 8 9

 #Q2. Count all sorted rows in a matrix

 ## Given a matrix of m*n size, the task is to count all the rows in a matrix that are sorted either in strictly increasing order or in strictly decreasing order?
 
 **Examples :** 
Input : m = 4,  n = 5
        mat[m][n] = 
                    1 2 3 4 5
                    4 3 1 2 6
                    8 7 6 5 4
                    5 7 8 9 10
 Output: 3 

 #Q3. Efficiently compute sums of diagonals of a matrix
 
 ## Given a 2D square matrix, find the sum of elements in Principal and Secondary diagonals. For example, consider the following 4 X 4 input matrix.
 
 **Input :** 
4
 1       2     3     4
 4       3     2    1
 7       8     9    6
 6       5     4    3
 Output :
 Principal Diagonal: 16
 Secondary Diagonal: 20
 Input :
 3
 1 1 1
 1 1 1
 1 1 1
 Output :
Principal Diagonal: 3
 Secondary Diagonal: 3

# Q4. Printing Boundary Elements of a Matrix.
 
 ## Given a matrix of size n x m. Print the boundary elements of the matrix. Boundary elements are those elements that are not urrounded by elements in all four 
directions, i.e. elements in the first row, first column, last row, and last column

**Examples:** 
Input:      
            1 2 3 4  
            5 6 7 8
            1 2 3 4
            5 6 7 8
 Output : 
         1 2 3 4 
         5       8 
         1       4 
         5 6 7 8
 Input:
 Output: 
             1 2 3   
             5 6 7 
             1 2 3 
        1 2 3
        5    7
        1 2 3
        
# Q5.Print all elements in sorted order from row and column wise sorted matrix by using 
Collection.
 nput: mat[][] = { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                          {32, 33, 39, 50},
                   };
 Output: 10 15 20 25 27 29 30 32 33 35 37 39 40 45 48 50
 [Note: consider all elements are unique only]