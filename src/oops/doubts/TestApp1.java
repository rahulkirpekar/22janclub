package oops.doubts;

public class TestApp1 
{
	public static void main(String[] args) throws Exception 
	{
		Employee e = (oops.doubts.Employee)Class.forName("oops.doubts.Employee").newInstance();
		
		e.no2=100;

		System.out.println(e+ " "+ e.no2);
		
		
		
	}

}
