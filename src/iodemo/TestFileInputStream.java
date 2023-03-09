package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try (
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\22janclub\\src\\iodemo\\TestFileOutputStream.java");
			)
		{
			int temp =  0 ;
			while(	(temp = fin.read())	!= -1) 
			{
				sb.append((char)temp);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		System.out.println("Line - " + sb);
	}
}
