import java .util.Scanner;
class ArraySearchElement
{
public static void main(String args[])
{
int n,x,i=0,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the element you want to find:");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Element found at position:"+(i+1));
}
else
{
System.out.println("Element not found:");
}
}
}

























