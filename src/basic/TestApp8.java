package basic;
public class TestApp8 
{
	private int counter1;
	private static int counter2;
	public TestApp8() 
	{
		counter1++;
		counter2++;
		System.out.println("counter1 - " + counter1 + "\t\t counter2 : " + counter2);
	} 
	void disp() 
	{
		System.out.println("counter1 - " + counter1 + "\t\t counter2 : " + counter2);
	}
	public static void main(String[] args) 
	{
//		counter2=0
		TestApp8 obj1 = new TestApp8();// obj1--->counter1=1 / counter2=1
		TestApp8 obj2 = new TestApp8();// obj2--->counter1=1 / counter2=2
		TestApp8 obj3 = new TestApp8();// obj3--->counter1=1 / counter2=3
		TestApp8 obj4 = new TestApp8();// obj4--->counter1=1 / counter2=4
		TestApp8 obj5 = new TestApp8();// obj5--->counter1=1 / counter2=5
		
		obj1.disp(); // obj1--->counter1=1 / counter2=5   
		obj2.disp(); // obj2--->counter1=1 / counter2=5   
		obj3.disp(); // obj3--->counter1=1 / counter2=5   
		obj4.disp(); // obj4--->counter1=1 / counter2=5   
		obj5.disp(); // obj5--->counter1=1 / counter2=5   
		int no=100;
		int test= 10;
		System.out.println("No " + no);
		
	}
}
