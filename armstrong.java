import java.util.*;
class armstrong
{
public static void main(String args[])
{
int temp,sum=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to find");
int n=sc.nextInt();
temp=n;
while(temp!=0)
{
rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(sum==n)
System.out.println("armstrng");
else
System.out.println("nt armstrng");


}


}
