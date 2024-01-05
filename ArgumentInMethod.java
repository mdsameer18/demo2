class ArgumentInMethod
{  
void m(ArgumentInMethod obj){  
System.out.println("method is invoked");  
}  
void p()
{  
m(this);  
}  
public static void main(String args[])
{  
ArgumentInMethod ob = new ArgumentInMethod();  
ob.p();  
}  
}  