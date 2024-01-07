class Animal
{
public void eat()
{
System.out.println("i can eat");
}
}
class Dog extends Animal
{
public void eat()
{
System.out.println("he eat dog food");
}
public void bark()
{
System.out.println("he can Bark");
}
}
class MethodOveriding
{
public static void main(String args[])
{
Dog d=new Dog();
d.eat();
d.bark();
}
}
