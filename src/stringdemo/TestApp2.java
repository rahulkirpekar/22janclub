package stringdemo;

public class TestApp2 
{	
	public static void main(String[] args) 
	{
//		String name1 = "rahul";
//		String name2 = "krunal";
//		String name3 = "rakesh";
//		String name4 = "rahul";
//		String name5 = name2.concat(" kirpekar");
//		String name6 = new String("rahul").intern();
		
//		System.out.println(name1==name5);// false
//		System.out.println(name1==name3);// false
//		System.out.println(name2==name4);// false
//		System.out.println(name3==name5);// false
//		System.out.println(name1==name6);// true
//		System.out.println(name1.hashCode() + " " + name6.hashCode());
				
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = s1;
		Student s3 = new Student(2, "krunal", 11);
		Student s4 = s2;
		
		System.out.println(s1==s2);// true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s1=s3);
		System.out.println(s1.getName().equals(s2.getName()));
	}
}
