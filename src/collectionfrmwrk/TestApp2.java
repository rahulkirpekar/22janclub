package collectionfrmwrk;

import java.util.ArrayList;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>mainList = new ArrayList<String>();
		mainList.add("India");
		mainList.add("UK");
		mainList.add("US");
		mainList.add("Pakistan");
		mainList.add("China");

		System.out.println("MainList : " + mainList);
		
		mainList.set(2, "United States of America");
		
		
		
//		mainList.remove(1);
//		mainList.remove("UK");
		
//		ArrayList<String>subList = new ArrayList<String>();
//		subList.add("India");
//		subList.add("SriLanka");
//		subList.add("Bangladesh");
//		subList.add("Australia");
//		System.out.println("subList : " + subList);

//		mainList.retainAll(subList);
		System.out.println("Updated MainList : " + mainList);
//		mainList.addAll(2, subList);
//		mainList.addAll(subList);
//		System.out.println("Updated MainList : " + mainList);
//		System.out.println("subList : " + subList);
	}
}
