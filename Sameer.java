class C
{
public void display()
{
System.out.println("method of clas c");
}
}
class A extends C

{
void display()
{
System.out.println("method of class A");
}
}
class B extends C
{
void display()
{
System.out.println("method of class b");
}
}
class Bharath
{
public static void main(String args[])
{
B b=new B();
b.display();
b.display();
b.display();
}
}