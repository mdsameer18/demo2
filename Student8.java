class Student8
{
int rollno;
String name;
float fee;
Student8(int rollno, String name, float fee)
{
this.rollno = rollno;
this.name = name;
this.fee = fee;
}
void display()
{
 System.out.println(rollno+"  "+name+" "+fee);
}
}
class TestThis2
{
public static void main(String args[])
{
Student8 s1 = new Student8(18,"KOHLI",5000f);
Student8 s2 = new Student8(12,"VIRAT",6000f);
s1.display();
s2.display();
}
}