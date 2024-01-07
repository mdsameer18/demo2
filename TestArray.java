import java.util.Scanner;
class Trainer
{
private int tid;
public void setTid(int tid)
{
this.tid=tid;
}
public int getTid()
{
return this.tid;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer()
{
this.tid=0;
}
}
class TestArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Trainer ob=new Trainer[1];
for(int i=0;i<3;i++)
{
ob[i]=new Trainer();
ob[i].setTid(sc.nextInt());

}
System.out.println("Details are:\n");
for(int j=0;j<3;j++)
{
System.out.println("TID:"+ob[j].getTid());
}
}
}

