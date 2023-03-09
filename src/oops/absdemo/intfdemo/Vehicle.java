package oops.absdemo.intfdemo;

public  interface  Vehicle 
{
	// 1) Dm's
	 int SPEED = 100;// public static final
	
	// 2) abstract methods
	 void test1();// public abstract
	 void test2();// public abstract
	 void test3();// public abstract
	 void test4();// public abstract
		
	// 3) NonAbstract Methods---[static / default / private]
	default void test6() 
	{
		test8(); 
		System.out.println("Vehicle - default test6()");
	}
	static void test7() 
	{
		System.out.println("Vehicle - static test7()");
	}
	private void test8() 
	{
		System.out.println("Vehicle - private test8()");
	}
}

