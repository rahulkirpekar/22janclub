package threadtopic;

public class TestApp2 extends Thread
{
	public void run() 
	{
		for (int i = 0; i <=5; i++) 
		{
			if (!Thread.currentThread().isDaemon()) 
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			} else 
			{
				System.out.println("Hi, I am Thread - " + Thread.currentThread().getName() + " " +getPriority());
			}
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		TestApp2 thread1 = new TestApp2();
		TestApp2 thread2 = new TestApp2();
		TestApp2 thread3 = new TestApp2();

		thread1.setDaemon(true);
		
		thread1.setName("C Language");
		thread2.setName("C++ Language");
		thread3.setName("Java Language");

		thread1.start();
		
		thread2.start();
		
		thread3.start();
		
		System.out.println("Exit main method");
	}
}
