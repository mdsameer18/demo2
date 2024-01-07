class A
{
void eat()
{
System.out.println("starint..........");
}
}
class Animal extends A
{
void eat()
{
System.out.println("eating........");
}
void bark()
{
System.out.println("barking...........");
}
void work()
{
super.eat();
bark();
}
}
class SuperKeyword2
{
public static void main(String args[])
{
Animal a=new Animal();
a.eat();
a.bark();
a.work();
}
}