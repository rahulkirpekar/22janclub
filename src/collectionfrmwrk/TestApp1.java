package collectionfrmwrk;
import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		ArrayList list = new ArrayList();		
		
		list.add(10);//<===itr  0---Integer.valueOf(10)---AUTO Boxing
		list.add(10.2134);//1
		list.add(10L);//2
		list.add(true);//3
		list.add("rahul");//4
		list.add('R');//5
		list.add(s);//6
		System.out.println("list.size() - " + list.size());
		
		// for-Each / Enhanced for / Advanced for loop
		for( Object obj  : list) 
		{
			System.out.println(obj);
		}
// ------------------------------------------------------------------------------------		
//		for(int i=0;i<list.size();i++) 
//		{
//			System.out.println("list.get("+i+") - " + list.get( bni));
//		}
// ------------------------------------------------------------------------------------						
//		Iterator itr1 = 	list.iterator();
//		System.out.println("itr1==> " + itr1);
//		while(itr1.hasNext()) 
//		{
//			Object obj = itr1.next();
//			System.out.println(obj);
//		}
	}
}
