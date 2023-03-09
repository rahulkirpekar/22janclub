package basic;

import java.util.Scanner;
public class Student 
{
	private int rno;
	private int std;
	private java.lang.String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rno, java.lang.String name ,int std) {
		super();
		this.rno = rno;
		this.name=name;
		this.std = std;
	}
	public Student(Student s) 
	{
		super();
		this.rno = s.rno;
		this.name= s.name;
		this.std = s.std;
	}
	
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
		System.out.println(rno + " " +name + " " + std+" - " + this);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}



