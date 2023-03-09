package basic;

public class TestApp4 
{
	// static Block
	static 
	{
		System.out.println("1) Static Block");
	}	
	// Instance Block
	{
		System.out.println("4) For Instance Statement");
	}
	{
		System.out.println("2) For Instance Statement");
	}
	{
		System.out.println("3) For Instance Statement");
	}
	{
		System.out.println("4) Instance Block");
		System.out.println("1) For Instance Statement");
	}
	public TestApp4() 
	{
		System.out.println("5) Default Constructor");		
	}
	public TestApp4(int no1) 
	{
		System.out.println("5) Para Constructor");		
	}
	public static void test1() 
	{
		System.out.println("3) static Method");
	}
	public void test2() 
	{
		System.out.println("6) Non-Static Method");
	}
	static int getAns(int no1,int no2) 
	{
		return (no1+no2);
	}
	public static void main(String[] args) 
	{
		int ans = getAns(10,20);
		System.out.println("2) START :: MAIN method");
		test1(); 
		TestApp4 obj = new TestApp4(); 
		obj.test2();
		System.out.println("EXIT MAIN method");
	}
}
// main();



