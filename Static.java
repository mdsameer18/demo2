class Student
{
int rollno;
String name;
static String college="ITS";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+""+name+""+college);
}
}
public class TestStaticVariable1
{
public static void main(String args[])
{
Student s1=new Student(28044,"SAMEER");
Student s2=new Student(18,"VIRAT");
Student.college="MTIET";
s1.display();
s2.display();
}
}