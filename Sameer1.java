import java.util.Scanner;
class Sameer1
{
public static void main(String args[])
{
int i,j=0;
for(i=0;i<3;i++)
{
System.out.print("\n");
for(j=0;j<5;j++)
{
if(j%2==1)break;
System.out.print("i="+i+"j="+j);
}
}
}
}