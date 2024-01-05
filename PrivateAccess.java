class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
}
class PrivateAccess
{
public static void main(String args[])
{
Student ob1=new Student();
ob1.setId(28044);
ob1.setName("SAMEER");
System.out.println("ID:"+ob1.getId());
System.out.println("NAME:"+ob1.getName());
}
}
