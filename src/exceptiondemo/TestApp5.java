package exceptiondemo;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		try 
		{
			a[5] = 10;
			
		} catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}catch(NullPointerException e) 
		{
			System.out.println("NullPointerException Handled");
		}catch(Exception e) 
		{
			System.out.println("Exception Handled");
		}
		finally 
		{
			System.out.println("Finally Block");
		}
		System.out.println("success");
	}
}
