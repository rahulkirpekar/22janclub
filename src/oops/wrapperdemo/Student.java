package oops.wrapperdemo;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.scan();
		s2.scan();
		
		s1.disp();
		s2.disp();
		
//		System.out.println("S1---> " + s1);
		System.out.println("S1.toString()---> " + s1.toString());
		System.out.println("S2.toString()---> " + s2.toString());

	}
	@Override
	public String toString() 
	{
		return rno + " " + name + " " +std;
	}
}
