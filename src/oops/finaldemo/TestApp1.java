package oops.finaldemo;

public class TestApp1 
{
	public final int no ;
	
	public TestApp1() 
	{
		no=100;
	}
	public TestApp1(int no) 
	{
		this.no=no;
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new  TestApp1(2000);
		
		System.out.println("obj.no---"+obj.no);
		
		
	}
}
