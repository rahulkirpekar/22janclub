package oops.absdemo.intfdemo;

public class ElecTw extends TW
{
	@Override
	public void test3() 
	{
		System.out.println("ElecTw - test3()");
	}
	@Override
	public void test4() 
	{
		System.out.println("ElecTw - test4()");		
	}
	public static void main(String[] args) 
	{
		Vehicle vehicle = new ElecTw();
		vehicle.test1(); 
		
		Vehicle.test7();
		vehicle.test6();
		
		
		
	}

}
