import java.io.*;
public class star180*
{
    public static void printstar(int n)
    {
	int i,j;
	for(i=0;i<n;i++)//no of rows  i.e n=5
	{
		for(j=2*(n-i);j>=0;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
	System.out.println();
	}
     }
  public static void main(String args[])
  {
	int n=5;
	printstar(n);
   }
}
