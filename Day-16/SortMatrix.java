import java.util.*;

class SortMatrix {
    public static void main(String[] args) {
    int [][] mat = { {5, 4, 7},
                        {1, 3, 8},
                        {2, 9, 6} };

List<Integer> al = new LinkedList<>();

for(int[] num: mat)
    for(int no : num)
    al.add(no);

Collections.sort(al);
System.out.println(al);

    }
}
/*
import java.util.*;

class Main {
    public static void main(String[] args) {
int [][] mat = { {5, 4, 7},
                    {1, 3, 8},
                    {2, 9, 6} };

int n = mat.length;
int total = n*n;------> check readme file to understand

int [] newArray = new int[total];

int k = 0;
for(int i = 0 ; i< mat.length; i++)
{
    for(int j = 0; j< mat[i].length; j++)
    {
        newArray[k++] = mat[i][j];
    }
}

Arrays.sort(newArray);
k =0;
for(int i = 0; i< mat.length; i++)
{
    for(int j = 0 ; j< mat[i].length; j++)
    {
        mat[i][j]= newArray[k++];
    }
}


System.out.println(Arrays.deepToString(mat));

    }
}
*/