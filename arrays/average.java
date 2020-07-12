import java.util.*;
public class average{
public static void main(String args[])
{
int n,i,sum=0;
float avg;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of elements");
n=sc.nextInt();
System.out.println("enter the all elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("sum:"+sum+"\n");
avg=(float)sum/n;
System.out.println("average:"+avg);
}
}
