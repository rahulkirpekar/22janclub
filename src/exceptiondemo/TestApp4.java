package exceptiondemo;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		try 
		{
			try 
			{
				a[5] = 10;
			} catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("ArrayIndexOutOfBoundsException Handled");
//				e.printStackTrace();
			}
			try 
			{
				String name  = null;
				System.out.println(name.length());

			} catch (NullPointerException e) 
			{
				System.out.println("NullPointerException Handled");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}
