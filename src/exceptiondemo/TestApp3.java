package exceptiondemo;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			Object obj = Class.forName("exceptiondemo.TestApp1").newInstance();
		
			System.out.println(obj);
		
		} catch (ClassNotFoundException e) 
		{
//			System.out.println("got ClassNotFoundException");
			e.printStackTrace();
		} catch (InstantiationException e) 
		{
			e.printStackTrace();
		} catch (IllegalAccessException e) 
		{
			e.printStackTrace();
		}
	} 
}
