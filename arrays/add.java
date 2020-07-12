import java.util.*;
public class prog{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,n;
System.out.println("enter how many num to add");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the number to add");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("sum"+sum);
}
}
