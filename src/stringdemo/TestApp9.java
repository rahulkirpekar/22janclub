package stringdemo;

import java.util.Scanner;

public class TestApp9 
{
	public static boolean isPalindrome(String word) 
	{
		boolean flag = true;
		for (int i = 0,j = (word.length()-1); i < word.length(); i++,j--) 
		{
			if (word.charAt(i)!=word.charAt(j)) 
			{
				flag = false;	
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Statement  : ");
		String stmt = sc.nextLine();
		String stmtWords[] = stmt.split(" ");
		int palidromeCount=0;
		for (int i = 0; i < stmtWords.length; i++) 
		{
			if(isPalindrome(stmtWords[i].trim())) 
			{
				palidromeCount++;
			}
		}
		System.out.println("Total Palindrome Word Count : " + palidromeCount);
	}
}
