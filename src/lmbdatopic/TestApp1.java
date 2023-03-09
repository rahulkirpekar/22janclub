package lmbdatopic;

public class TestApp1 
{
	public void testApp()
	{
		Vehicle vechile =   (no1,no2) -> (no1+no2);
		
		System.out.println("Addition : " + vechile.addFun(20,10));
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		obj.testApp();
		
	}
}
