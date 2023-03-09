package threadtopic;
// resources
public class Table 
{
	public void printTable(int no) 
	{
		synchronized (this) 
		{
			for (int i = 1; i <=10; i++) 
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " - " +  no  +" " + i + " " +(no*i));
			}
		}
	}
}
