package stringdemo;

import java.util.Scanner;

public class TestApp7 
{
	String stmt = "";
	
	public int getStringWordsCount(String stmt) 
	{
		int count =1 ; 
		for(int i=0;	i<stmt.length();	i++) 
		{
			if(stmt.charAt(i) == ' ') 
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		TestApp7 obj = new TestApp7();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Statement : ");
		obj.stmt = sc.nextLine().trim();
		
		int count = obj.getStringWordsCount(obj.stmt);
		
		System.out.println("Total Words : " + count);
	}
}
