import java.util.*;
class perfectsqr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
double b=Math.sqrt(a);
if(b%1==0)
{
System.out.println("entered num is psqrt");
}
else
{
System.out.println("entered num is nt a psqrt");
}
}
}
