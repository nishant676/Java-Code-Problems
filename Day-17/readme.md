# Q1.Java Program to find Sum of all elements of each row of a matrix.
 
 Input : 
 1 2 3
 4 5 6
 7 8 9
 Output : 
 1 2 3  6
 4 5 6  15
 7 8 9  24

# Q2.Java Program to print lower diagonal of a matrix.
 Input : 
 1         2          3
 4         5          6
 7         8          9
 Output : 
 1 0 0
 4 5 0
 7 8 9

 >[!NOTE]
 >Means --> all elemetns present when **i >=j**


# Q3.Java program to check a given matrix is an identity matrix or not.
 The identity matrix of size n is the n x n square matrix with ones on the main 
diagonal and zeros elsewhere.
 Input :
 int Matrix1[3][3] = {
        { 1, 0, 0 },
        { 0, 1, 0 },
        { 0, 0, 1 }
    };
 int Matrix2[3][3] = {
        { 1, 0, 0 },
        { 2, 1, 0 },
        { 0, 0, 1 }
    };
 Output:
 Matrix1 is an IDENTITY MATRIX
 Matrix2 is NOT an identity matrix


# Q4.Java program to check a given matrix is a **sparse** matrix or not.
 RUN 1:
 Enter the elements of the matrix:
 4 5 6
 7 0 0
 0 0 0
 Matrix is a Sparse Matrix
 RUN 2:
 Enter the elements of the matrix:
 1 2 3
 4 5 6
 7 8 9
 Matrix is not a Sparse Matrix

 >[!NOTE]
 > A sparse matrix is a matrix that has mostly 0s in it.
 > If 90% or more element is Zero then its sparse

# Q5.Java program to print the upper triangular matrix.
 Matrix:
 9 8 7 
5 4 6 
1 2 3 
Upper triangular matrix is: 
9 8 7 
  4 6 
     3
