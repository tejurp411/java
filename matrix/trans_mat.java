import java.util.*;
public class trans_mat
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter the nos of rows and clomns");
int m,n,i,j;
m=sc.nextInt();
n=sc.nextInt();
int mat[][]=new int[m][n];
int trans[][]=new int[m][n];
System.out.println("enter the matrix to transform");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
mat[i][j]=sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
trans[i][j]=mat[j][i];
}
}
System.out.println("the transform matrix is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(trans[i][j]+" ");
}
System.out.println();
}


}

}
