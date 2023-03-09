package threadtopic;

public class TestApp1 extends Thread 
{
	// Thread---job defined---run method
	@Override
	public void run() 
	{
		for (int i = 1; i<=5 ; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i + " - " +Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("START Main Method");
		TestApp1 th1 = new TestApp1();
		TestApp1 th2 = new TestApp1();
		TestApp1 th3 = new TestApp1();
		TestApp1 th4 = new TestApp1();
		TestApp1 th5 = new TestApp1();
		TestApp1 th6 = new TestApp1();
		th1.setName("C ");
		th2.setName("C++ ");
		th3.setName("Python");
		th4.setName("Core Java");
		th5.setName("Scala");
		th6.setName("Go");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		System.out.println("EXIT Main Method");
	}
}
