package oops.absdemo.intfdemo;

public abstract class TW implements Vehicle
{
	public void test1() 
	{
		System.out.println("TW - test1()");
	}
	@Override
	public void test2() {
		System.out.println("TW - test2()");
	}
}
