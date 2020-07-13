import java.util.*;
public class prime{
public static void main(String args[])
{
int n,i;
boolean isprime=true;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
isprime=false;
break;
}
}
if(isprime)
System.out.println("number is prime");
else
System.out.println("number is not prime");
}
}
