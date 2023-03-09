package exceptiondemo;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		try 
		{
			try 
			{
				String name = null;
				System.out.println("name.length() - " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				int a[] = new int[5];
				a[5]  = 100;
	
			} catch (Exception e) 
			{
				e.printStackTrace();
			}			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}finally 
		{
			System.out.println("Finally Block Executed");
		}		
		System.out.println("success");
	}

}
