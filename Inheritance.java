class Employee
{
int salary=10000;

}
class ProgrammerextendsEmployee
{
int amount=20000;
}
class Inheritance
{
public static void main(String[] args)
{
ProgrammerextendsEmployee p=new ProgrammerextendsEmployee();
System.out.println("ProgrammerextendsEmployee salary:"+p.salary);
System.out.println("ProgrammerextendsEmployee amount:"+p.amount);
}}