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
class PrivateAccess1
{
public static void main(String args[])
{
Student ob1=new Student();
ob1.setId(28044);
ob1.setName("SAMEER");
System.out.println("ID:"+ob1.getId());
System.out.println("NAME:"+ob1.getName());
Student ob2=new Student();
ob2.setId(28044);
ob2.setName("SAMEER");
System.out.println("ID:"+ob2.getId());
System.out.println("NAME:"+ob2.getName());
Student ob3=new Student();
ob3.setId(28044);
ob3.setName("SAMEER");
System.out.println("ID:"+ob3.getId());
System.out.println("NAME:"+ob3.getName());
Student ob4=new Student();
ob4.setId(28044);
ob4.setName("SAMEER");
System.out.println("ID:"+ob4.getId());
System.out.println("NAME:"+ob4.getName());
Student ob5=new Student();
ob5.setId(28044);
ob5.setName("SAMEER");
System.out.println("ID:"+ob5.getId());
System.out.println("NAME:"+ob5.getName());
}
}
