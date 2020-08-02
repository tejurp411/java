import java.util.*;
public class prftcub
{
public static void prftcub(int n)
{
int cube,i;
for(i=0;i<=n;i++)
{
cube=i*i*i;
if(cube==n)
{
System.out.println("number is cube");
return;
}
else if (cube>n)
{
System.out.println("number is nt a cube");
return;
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int n=sc.nextInt();
prftcub(n);
}
}
