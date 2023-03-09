package oops.constdemo;

public class B extends A
{
	int no2;
	public B() 
	{
		System.out.println("Default Const B -- ");
		no2=20;
	}
	public B(int no1,int no2) 
	{
//		super(no1);
		System.out.println("Para Const B -- ");
		this.no2=no2;
	}
	public static void main(String[] args) 
	{
		B obj = new B(10,20);

		System.out.println(obj.no1 + " " + obj.no2);
		
	}
}
