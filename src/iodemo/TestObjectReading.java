package iodemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestObjectReading 
{
	public static void main(String[] args) 
	{
		try(
				FileInputStream fin = new FileInputStream("dpslist.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
		    ) 
		{
			Object obj = oin.readObject();
			
			Student s[] = (Student[])obj;
			
			for (int i = 0; i < s.length; i++) 
			{
				System.out.println(s[i].getRno() + " " + s[i].getName() + " " + s[i].getStd());
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
