package collectionfrmwrk.settopic;

import java.util.PriorityQueue;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul"); 
		Iterator<String>itr =	queue.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
