package exceptiondemo;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int no1,no2,ans;
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		try 
		{
			// exception raise code
			ans = no1/no2;
		}catch(NullPointerException e) 
		{
			ans = 10;
			// exception handled
			e.printStackTrace();
		}catch(Exception e) 
		{
			ans = 20;
			// exception handled
			e.printStackTrace();
		}
		System.out.println("Addition : " + ans);
	}
}
