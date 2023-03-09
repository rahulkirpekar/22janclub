package oops.folmetoer;

public class TW extends Vehicle
{
	void run() 
	{
		System.out.println("TW - run()");
	}
	public static void main(String[] args) 
	{
		TW v = new TW();
		
		v.run();
	}
}
