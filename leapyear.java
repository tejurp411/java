import java.util.*;
class leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int n=sc.nextInt();
boolean flag = false;
if(n%400==0)
{
flag=true;
}
else if(n%100==0)
{
flag=false;
}
else if(n%4==0)
{
flag=true;
}
else
{
flag=true;
}
if(flag)
{
System.out.println("entered year is a leap year");
}
else
{
System.out.println("entered year is nt a leap year");
}
}
}
