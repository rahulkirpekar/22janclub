package basic.staticdemo;

import java.util.Iterator;
import java.util.Scanner;

public class Student 
{
	private int rno;// Per Object memory Allocation--UNIQUE Data
	private String name;// Per Object memory Allocation--UNIQUE Data
	private int std;// Per Object memory Allocation--UNIQUE Data
	private static String schoolName;// Per Class Memory Allocation[ONE COPY]
	
	// static methods -- To initialise Static Data Members
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name  = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " " + std + " " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		s[0].schoolName = "Meghdoot Vidhya Vihar";

		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
		
		s[0].schoolName = "ABCDEFG";
		System.out.println("Changed By Another Object : ");
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
}
