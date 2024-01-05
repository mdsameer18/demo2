import java.util.Scanner;
class Employee
{
private int eid;
private String ename;
private String edept;
public void setEid(int eid){this.eid=eid;
}
public void setEname(String ename)
{
this.ename=ename;
}
public void setEdept(String edept)
{
this.edept=edept;
}
public int getEid()
{
return this.eid;
}
public String getEname()
{
return this.ename;
}
public String getEdept()
{
return this.edept;
}
}
class PrivateAccessArrayEmployee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee[] ob=new Employee[3];
for(int i=0;i<3;i++)
{
ob[i]=new Employee();
ob[i].setEid(sc.nextInt());
ob[i].setEname(sc.next());
ob[i].setEdept(sc.next());
}
System.out.println("Details are:");
for(int j=0;j<3;j++)
{
System.out.println("EID:"+ob[j].getEid());
System.out.println("ENAME:"+ob[j].getEname());
System.out.println("EDEPT:"+ob[j].getEdept());
}
}
}