package stringdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal"; 
		String name2 = "royal"; 
		String name3 = name1;
		name1 = name1.concat(" Technosoft");

		name2 = name2 + " " + "Technoft Pvt Ltd";
		
		System.out.println("name1 : " + name1);
		
		
	}
}
