import java.util.*;
class maxandmin{
public static void main(String args[])
{
int a[]={1,5,8,9,4,7};
int min=a[0];
int max=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("minimum value is:"+min);
System.out.println("maximum value is:"+max);
}}
