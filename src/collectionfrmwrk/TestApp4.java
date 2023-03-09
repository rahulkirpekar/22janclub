package collectionfrmwrk;

import java.util.Vector;
import java.util.ListIterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		list.add("rahul");
		list.add("kenil");
		list.add("shaan");
		list.add("vinay");
		list.add("vraj");
		list.add("ansh");
		ListIterator<String> itr =	list.listIterator();
		while (itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("After forward : ");
		while (itr.hasPrevious()) 
		{
			String name = itr.previous();
			System.out.println(name);
		}
	}
}