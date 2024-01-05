import java.util.Scanner;
class PalindromeNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int pn=0;
n=sc.nextInt();
int num=n;
while(n>0)
{
pn=pn*10+(n%10);
n=n/10;
}
if(num==pn)
{
System.out.println("PALINDROME");
}
else
{
System.out.println("NOT A PALINDROME");
}
}
}