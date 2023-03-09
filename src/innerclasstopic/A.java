package innerclasstopic;

public class A 
{
	private int no=100;
	// 1) Member InnerClass
	class B
	{
		void getData() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A  outerObj = new A();
	
		A.B innnerObj	= outerObj. new B();
		
		innnerObj.getData();
		
		System.out.println(System.out + " - " + System.out.getClass().getName());

	}
}
