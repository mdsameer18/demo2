final class Bike
{
System.out.println("running");
}
class Honda extends Bike
{
void run()
{
System.out.println("runnig safely with 100kmp");
}
}
class ThisKeyword2
{
public static void main(String args[])
{
Honda h=new Honda();
h.run();
}
}