import java.util.Scanner;
class PalindromeString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n;
String ps="";
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
ps=ps+n.charAt(i);
}
if(n.equals(ps))
{
System.out.println("PALINDROME");
}
else
{
System.out.println("NOT A PALINDROME");
}
}
}