package iodemo;

import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class TestFileReader 
{
	public static void main(String[] args) 
	{
		File directory = new File("./");		
		
		String path = directory.getAbsolutePath()+"\\src\\iodemo\\TestFileReader.java";
		
		 System.out.println(path);
		 try(
				FileReader fr  = new FileReader(path);
	       )
		{
			int temp = 0 ; 
			while( (temp = fr.read()) != -1	) 
			{
				System.out.print((char)temp);
			}
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
}
