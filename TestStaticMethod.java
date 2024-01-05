class Student
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college=" MTIET";
}
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

public class TestStaticMethod
{
public static void main(String args[])
{
Student s1=new Student(18," Kohli");
Student s2=new Student(18," THARUN");
Student.change();
Student s3=new Student(18," SAMEER");
s1.display();
s2.display();
s3.display();
}
}

