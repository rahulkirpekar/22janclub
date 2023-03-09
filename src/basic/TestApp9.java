package basic;

public class TestApp9 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException 
	{
//		Object obj = Class.forName("basic.Student").newInstance();
//		Student s = (Student)obj;
//		s.scan();
//		s.disp();
//		Reflection API
		Student s = new Student(1, "rahul", 12);
		
		Student s2 = (Student) s.clone();
		
		s2.disp();
		
	}
}
