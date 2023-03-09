package basic;

public class TestApp2 
{
	static void test(char charValue,int...intValue) 
	{
		for(int i=0;i<intValue.length;i++) 
		{
				System.out.println(charValue + " " + intValue[i]);
		}
	}
	public static void main(String...args) throws InterruptedException 
	{
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		// other code---100 lines-----3/4/100/54/43/...
		
		test('+',10,20,30,40,50);
		
//		Student s= new Student();
//		s.scan();
//		s.disp();
//		Thread.sleep(1000000000);
//		System.out.println("End of the Programs");
	}
}
