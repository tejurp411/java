import java.io.*;

public class star
{
    public static void printstar(int n)
    {
	int i,j;
	for(i=0;i<n;i++)//no of rows  i.e n=5
	{
		for(j=0;j<=i;j++)//for the stars
		{
			System.out.print("*");
		}
	System.out.println( );//end of line after each row
	}
     }
  public static void main(String args[])
  {
	int n=5;
	printstar(n);
   }
}
