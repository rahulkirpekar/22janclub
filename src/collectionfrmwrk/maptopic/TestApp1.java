package collectionfrmwrk.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		map.put(3, "sagar");
		map.put(1, "rahul");// <===
		map.put(4, "rakesh");
		map.put(2, "krunal");
		map.put(5, "amar");
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) 
		{
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
	}
}
