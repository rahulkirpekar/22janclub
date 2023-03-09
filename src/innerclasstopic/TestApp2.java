package innerclasstopic;

public class TestApp2 
{
	private int no=10;
	void getDetails() 
	{
		// 3) Local InnerClass
		class A
		{
			void getMsg() 
			{
				System.out.println("No : " + no);
			}
		}
		A obj = new A();
		obj.getMsg();
	}
	public static void main(String[] args) 
	{
		TestApp2 outer = new TestApp2();
		outer.getDetails();
	}
}
