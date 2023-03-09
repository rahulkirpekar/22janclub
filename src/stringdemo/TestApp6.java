package stringdemo;

import java.util.Scanner;

public class TestApp6 
{
	public static boolean isPalindromeName(String name) 
	{
		boolean flag = true;
		for (int i = 0,j=(name.length()-1); i < name.length(); i++,j--) 
		{
			if(name.charAt(i) != name.charAt(j)) 
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		
		boolean flag = TestApp6.isPalindromeName(name);
		
		if(flag) 
		{
			System.out.println("Name is Palindrome : " + name);
		}else
		{
			System.out.println("Name is not Palindrome : " + name);
		}
	}
}
