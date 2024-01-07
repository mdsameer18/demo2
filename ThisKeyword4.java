final class Bike
{
void run()
{
System.out.println("running");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("runnig safely");
}
}
class ThisKeyword4
{
public static void main(String args[])
{
Honda h=new Honda();
h.run();
}
}