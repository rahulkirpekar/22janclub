package threadtopic;
public class TestApp3 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		MyThread1 myThread1 = new MyThread1(resource);
		MyThread2 myThread2 = new MyThread2(resource);
		myThread1.start();
		myThread2.start();
	}
}