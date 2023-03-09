package oops.rundemo;

public class TestApp1 
{
	
	
	
	
	public static void main(String[] args) 
	{
//		A a = new A();
		A a = new B();
		 
		a.test1();
		((B)a).test2();
		
//		A a = new A();
//		A a = new B();
//		B a = new B();
//		B a = new A();// C.E
//		B a = (B)new A();// RunTime Error ---ClassCastException
//		System.out.println("a.no - " + a.no);
		
	} 
}
