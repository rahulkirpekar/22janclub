package iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name : ");
		String name = new java.util.Scanner(System.in).nextLine();
		
		try (
				FileWriter fw = new FileWriter("name.txt");
			)
		{
			fw.write(name);
			System.out.println("success");
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
