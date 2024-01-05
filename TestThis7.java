class Student8
{
int rollno;
String name,course;
float fee;
Student8(int rollno, String name,String course)
{
this.rollno = rollno;
this.name = name;
this.course =course;
}
Student8(int rollno,String name,String course,float fee)
{
this(rollno,name,course);
this.fee=fee;
}
void display()
{
 System.out.println(rollno+"  "+name+" "+course+" "+fee);
}
}
class TestThis7
{
public static void main(String args[])
{
Student8 s1 =new Student8(18,"KOHLI","java");
Student8 s2 =new Student8(12,"VIRAT","java",6000f);
s1.display();
s2.display();
}
}