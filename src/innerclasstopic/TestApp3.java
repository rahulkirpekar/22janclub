package innerclasstopic;

public class TestApp3 
{
	static int data = 100;
	
	// Nested Class --- Type of InnerClass
	static class Abc
	{
		void msg() 
		{
			System.out.println("Data - " + data);
		}
	}
	public static void main(String[] args) 
	{
		TestApp3.Abc obj = new TestApp3.Abc();
		
		System.out.println(obj);
		
//		TestApp3.Abc obj = new TestApp3.Abc();
		
		obj.msg();
		
		
	}
}
