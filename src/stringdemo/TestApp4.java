package stringdemo;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Royal");
	
		System.out.println(sb.hashCode() + " " + sb);
		
		sb.append(" Technosoft Pvt Ltd.");
		
		System.out.println(sb.hashCode() + " " + sb);
		
	}
}
