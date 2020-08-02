import java.util.*;
class palindrom
{
public static void main(String args[])
{
String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();
int l=s.length();
for(int i=l-1;i>=0;i--)
rev=rev+s.charAt(i);
if(s.equals(rev))
System.out.println("eneterd string is palindrom");
else
System.out.println("eneterd string is not palindrom");
}
}
