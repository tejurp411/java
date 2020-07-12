import java.util.*;
public class sort{
public static void main(String args[])
{
int n,i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}}}
