import java.lang.*;
import java.util.*;
public class countword
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
char ch[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
ch[i]=s.charAt(i);
if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)))
count++;
}
System.out.println(count);
}



}
