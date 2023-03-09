package collectionfrmwrk;

import java.util.LinkedList;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		LinkedList<Student> list = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		boolean flag = false;
		while(choice!=5) 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) for Insert Student record");
			System.out.println("2) for Update Student record");
			System.out.println("3) for Delete Student record");
			System.out.println("4) for Display all records Student record");
			System.out.println("5) for exit");
			choice = sc.nextInt();
			switch (choice) 
			{
				case 1:	Student s = new Student();
						s.scan();
						list.add(s);
						break;
				case 2: System.out.println("Enter Student Rno : ");
				        int updateRno = sc.nextInt();
						flag = false;
						Student supdate=null;
						int i = 0;
						for (; i < list.size(); i++) 
				        {
							supdate = list.get(i);
				        	if(updateRno == supdate.getRno()) 
				        	{
				        		flag= true;
				        		break;
				        	}
						}
				        if(flag) 
				        {
				        	supdate.update();
				        	list.set(i, supdate);
				        	System.out.println("Student records updated");
				        }else 
				        {
				        	System.out.println("given rno not found in Student records.");
				        }
					break;
				case 3:
					break;
				case 4: System.out.println("Students records Display");
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							s.disp();	
						}
					break;
				default:
					break;
			}
		}
	} 
}

