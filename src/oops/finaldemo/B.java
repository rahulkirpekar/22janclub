package oops.finaldemo;

public class B 
{
	void test() 
	{
		System.out.println("B - test()");
	}
	protected void finalize() throws Throwable 
	{
		System.out.println(" Hi I am Filalize method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Thread.currentThread().getName() --- " + Thread.currentThread().getName());
		B obj = new  B();
		obj = null;
		System.out.println("Before GC call");
//		System.gc();
		System.out.println("After GC call");
	}
}
