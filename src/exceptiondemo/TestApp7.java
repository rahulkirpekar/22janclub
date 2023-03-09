package exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

public class TestApp7 
{
	public static void isValidForVote(int age) throws InvalidForVoteException
	{
		if (age < 18) 
		{
			throw new InvalidForVoteException("Invalid Age ,\n\tPlease enter greater 18 age for vote");
			// SKIP---lines of code 
		} else 
		{
			System.out.println("Welcome fot vote");
		}
	}
	public static void test(int age) throws InvalidForVoteException
	{
			isValidForVote(age);
			System.out.println("test() line--2");
	}
	public static void main(String[] args) 
	{
		int age ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vote Age for Candidate : ");
		age = sc.nextInt();

		try {
			test(age);
		} catch (InvalidForVoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hanlded succsess");
	}
}
