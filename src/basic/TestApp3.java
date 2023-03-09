package basic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"om",12);
		Student s2 = new Student(2,"rakesh",10);
		Student s3 = s1;
		Student s4 = s2;
		
		s2 = null;
		
		// orphan ---delete gc wait 
		Student s5 = new Student(s3);
		
		s1.disp();
		s2.disp();
		s3.disp();
		s4.disp();
		s5.disp();
		//--- 0 
	}// garbage collector---->
}
